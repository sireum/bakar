Require Import String.
Require Import symboltable.
Open Scope string_scope.

Definition Coq_AST_Tree := 
(D_Procedure_Body 1 
  (mkprocedure_body 2
    (* = = = Procedure Name = = = *)
    ((*Test_Case_10*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification 3 ((*I1*) 2) Integer In) :: 
    (mkparameter_specification 4 ((*I2*) 3) Integer In) :: 
    (mkparameter_specification 5 ((*I3*) 4) Integer In) :: 
    (mkparameter_specification 6 ((*O1*) 5) Integer Out) :: 
    (mkparameter_specification 7 ((*O2*) 6) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration 8
  (D_Object_Declaration 9 (mkobject_declaration 10 ((*L1*) 7) Integer None)) 
  (D_Object_Declaration 11 (mkobject_declaration 12 ((*L2*) 8) Integer None))))
    (* = = = Procedure Body = = = *)
      (S_Sequence 13
      (S_Assignment 14 (E_Identifier 15 ((*L2*) 8) ) (E_Literal 16 (Integer_Literal 5) )) 
      (S_Sequence 17
      (S_Assignment 18 (E_Identifier 19 ((*L1*) 7) ) (E_Name 20 (E_Identifier 21 ((*I3*) 4) ))) 
      (S_Sequence 22
      (S_Assignment 23 (E_Identifier 24 ((*O2*) 6) ) (E_Name 25 (E_Identifier 26 ((*L1*) 7) ))) 
      (S_Sequence 27
      (S_Assignment 28 (E_Identifier 29 ((*L1*) 7) ) (E_Name 30 (E_Identifier 31 ((*I2*) 3) ))) 
      (S_Sequence 32
      (S_Assignment 33 (E_Identifier 34 ((*L1*) 7) ) (E_Binary_Operation 35 Plus (E_Name 36 (E_Identifier 37 ((*I1*) 2) )) (E_Name 38 (E_Identifier 39 ((*I2*) 3) )) )) 
      (S_Sequence 40
      (S_If 41 (E_Binary_Operation 42 Greater_Than (E_Name 43 (E_Identifier 44 ((*L1*) 7) )) (E_Literal 45 (Integer_Literal 5) ) )
        (S_If 46 (E_Binary_Operation 47 Less_Than (E_Name 48 (E_Identifier 49 ((*I1*) 2) )) (E_Literal 50 (Integer_Literal 0) ) )
          (S_Assignment 51 (E_Identifier 52 ((*L2*) 8) ) (E_Literal 53 (Integer_Literal 8) ))
          S_Null
        )
        S_Null
      ) 
      (S_Assignment 54 (E_Identifier 55 ((*O1*) 5) ) (E_Name 56 (E_Identifier 57 ((*L2*) 8) )))))))))
  )
).

Definition Symbol_Table := 
(mkSymbolTable
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*L2*) 8), (In_Out, Integer)) :: (((*O1*) 5), (Out, Integer)) :: (((*L1*) 7), (In_Out, Integer)) :: (((*I3*) 4), (In, Integer)) :: (((*I2*) 3), (In, Integer)) :: (((*I1*) 2), (In, Integer)) :: (((*O2*) 6), (Out, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Test_Case_10*) 1), (0, (mkprocedure_body 2
  (* = = = Procedure Name = = = *)
  ((*Test_Case_10*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification 3 ((*I1*) 2) Integer In) :: 
  (mkparameter_specification 4 ((*I2*) 3) Integer In) :: 
  (mkparameter_specification 5 ((*I3*) 4) Integer In) :: 
  (mkparameter_specification 6 ((*O1*) 5) Integer Out) :: 
  (mkparameter_specification 7 ((*O2*) 6) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration 8
(D_Object_Declaration 9 (mkobject_declaration 10 ((*L1*) 7) Integer None)) 
(D_Object_Declaration 11 (mkobject_declaration 12 ((*L2*) 8) Integer None))))
  (* = = = Procedure Body = = = *)
    (S_Sequence 13
    (S_Assignment 14 (E_Identifier 15 ((*L2*) 8) ) (E_Literal 16 (Integer_Literal 5) )) 
    (S_Sequence 17
    (S_Assignment 18 (E_Identifier 19 ((*L1*) 7) ) (E_Name 20 (E_Identifier 21 ((*I3*) 4) ))) 
    (S_Sequence 22
    (S_Assignment 23 (E_Identifier 24 ((*O2*) 6) ) (E_Name 25 (E_Identifier 26 ((*L1*) 7) ))) 
    (S_Sequence 27
    (S_Assignment 28 (E_Identifier 29 ((*L1*) 7) ) (E_Name 30 (E_Identifier 31 ((*I2*) 3) ))) 
    (S_Sequence 32
    (S_Assignment 33 (E_Identifier 34 ((*L1*) 7) ) (E_Binary_Operation 35 Plus (E_Name 36 (E_Identifier 37 ((*I1*) 2) )) (E_Name 38 (E_Identifier 39 ((*I2*) 3) )) )) 
    (S_Sequence 40
    (S_If 41 (E_Binary_Operation 42 Greater_Than (E_Name 43 (E_Identifier 44 ((*L1*) 7) )) (E_Literal 45 (Integer_Literal 5) ) )
      (S_If 46 (E_Binary_Operation 47 Less_Than (E_Name 48 (E_Identifier 49 ((*I1*) 2) )) (E_Literal 50 (Integer_Literal 0) ) )
        (S_Assignment 51 (E_Identifier 52 ((*L2*) 8) ) (E_Literal 53 (Integer_Literal 8) ))
        S_Null
      )
      S_Null
    ) 
    (S_Assignment 54 (E_Identifier 55 ((*O1*) 5) ) (E_Name 56 (E_Identifier 57 ((*L2*) 8) )))))))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((50, Integer) :: (53, Integer) :: (35, Integer) :: (44, Integer) :: (26, Integer) :: (56, Integer) :: (29, Integer) :: (38, Integer) :: (47, Boolean) :: (20, Integer) :: (55, Integer) :: (49, Integer) :: (31, Integer) :: (16, Integer) :: (52, Integer) :: (43, Integer) :: (34, Integer) :: (25, Integer) :: (37, Integer) :: (19, Integer) :: (45, Integer) :: (36, Integer) :: (57, Integer) :: (21, Integer) :: (48, Integer) :: (30, Integer) :: (39, Integer) :: (15, Integer) :: (42, Boolean) :: (24, Integer) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((50, (sloc (*Line*)13 (*Col*)21 (*EndLine*)13 (*EndCol*)21)) :: (53, (sloc (*Line*)15 (*Col*)23 (*EndLine*)15 (*EndCol*)23)) :: (35, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)21)) :: (44, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)13)) :: (26, (sloc (*Line*)8 (*Col*)15 (*EndLine*)8 (*EndCol*)16)) :: (56, (sloc (*Line*)19 (*Col*)15 (*EndLine*)19 (*EndCol*)16)) :: (29, (sloc (*Line*)9 (*Col*)9 (*EndLine*)9 (*EndCol*)10)) :: (38, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)21)) :: (47, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)21)) :: (20, (sloc (*Line*)7 (*Col*)15 (*EndLine*)7 (*EndCol*)16)) :: (55, (sloc (*Line*)19 (*Col*)9 (*EndLine*)19 (*EndCol*)10)) :: (49, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)17)) :: (31, (sloc (*Line*)9 (*Col*)15 (*EndLine*)9 (*EndCol*)16)) :: (16, (sloc (*Line*)6 (*Col*)15 (*EndLine*)6 (*EndCol*)15)) :: (52, (sloc (*Line*)15 (*Col*)17 (*EndLine*)15 (*EndCol*)18)) :: (43, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)13)) :: (34, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)10)) :: (25, (sloc (*Line*)8 (*Col*)15 (*EndLine*)8 (*EndCol*)16)) :: (37, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)16)) :: (19, (sloc (*Line*)7 (*Col*)9 (*EndLine*)7 (*EndCol*)10)) :: (45, (sloc (*Line*)11 (*Col*)17 (*EndLine*)11 (*EndCol*)17)) :: (36, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)16)) :: (57, (sloc (*Line*)19 (*Col*)15 (*EndLine*)19 (*EndCol*)16)) :: (21, (sloc (*Line*)7 (*Col*)15 (*EndLine*)7 (*EndCol*)16)) :: (48, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)17)) :: (30, (sloc (*Line*)9 (*Col*)15 (*EndLine*)9 (*EndCol*)16)) :: (39, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)21)) :: (15, (sloc (*Line*)6 (*Col*)9 (*EndLine*)6 (*EndCol*)10)) :: (42, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)17)) :: (24, (sloc (*Line*)8 (*Col*)9 (*EndLine*)8 (*EndCol*)10)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((8, ("L2", "ada://variable/Test_Case_10+1:15/L2+4:8")) :: (2, ("I1", "ada://parameter/Test_Case_10+1:15/I1+1:29")) :: (5, ("O1", "ada://parameter/Test_Case_10+1:15/O1+1:78")) :: (4, ("I3", "ada://parameter/Test_Case_10+1:15/I3+1:61")) :: (7, ("L1", "ada://variable/Test_Case_10+1:15/L1+3:8")) :: (3, ("I2", "ada://parameter/Test_Case_10+1:15/I2+1:45")) :: (6, ("O2", "ada://parameter/Test_Case_10+1:15/O2+1:95")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Test_Case_10", "ada://procedure_body/Test_Case_10+1:15")) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) package names map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) type names map = = = *)
  (*/////////////////////////////////////*)
  (nil)
))
).

Definition Coq_AST_Tree_X := 
(D_Procedure_Body_X 1 
  (mkprocedure_body_x 2
    (* = = = Procedure Name = = = *)
    ((*Test_Case_10*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification_x 3 ((*I1*) 2) Integer In) :: 
    (mkparameter_specification_x 4 ((*I2*) 3) Integer In) :: 
    (mkparameter_specification_x 5 ((*I3*) 4) Integer In) :: 
    (mkparameter_specification_x 6 ((*O1*) 5) Integer Out) :: 
    (mkparameter_specification_x 7 ((*O2*) 6) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration_X 8
  (D_Object_Declaration_X 9 (mkobject_declaration_x 10 ((*L1*) 7) Integer None)) 
  (D_Object_Declaration_X 11 (mkobject_declaration_x 12 ((*L2*) 8) Integer None))))
    (* = = = Procedure Body = = = *)
      (S_Sequence_X 13
      (S_Assignment_X 14 (E_Identifier_X 15 ((*L2*) 8) (nil)) (E_Literal_X 16 (Integer_Literal 5) (nil) nil)) 
      (S_Sequence_X 17
      (S_Assignment_X 18 (E_Identifier_X 19 ((*L1*) 7) (nil)) (E_Name_X 20 (E_Identifier_X 21 ((*I3*) 4) (nil)))) 
      (S_Sequence_X 22
      (S_Assignment_X 23 (E_Identifier_X 24 ((*O2*) 6) (nil)) (E_Name_X 25 (E_Identifier_X 26 ((*L1*) 7) (nil)))) 
      (S_Sequence_X 27
      (S_Assignment_X 28 (E_Identifier_X 29 ((*L1*) 7) (nil)) (E_Name_X 30 (E_Identifier_X 31 ((*I2*) 3) (nil)))) 
      (S_Sequence_X 32
      (S_Assignment_X 33 (E_Identifier_X 34 ((*L1*) 7) (nil)) (E_Binary_Operation_X 35 Plus (E_Name_X 36 (E_Identifier_X 37 ((*I1*) 2) (nil))) (E_Name_X 38 (E_Identifier_X 39 ((*I2*) 3) (nil))) (Do_Overflow_Check :: nil) nil)) 
      (S_Sequence_X 40
      (S_If_X 41 (E_Binary_Operation_X 42 Greater_Than (E_Name_X 43 (E_Identifier_X 44 ((*L1*) 7) (nil))) (E_Literal_X 45 (Integer_Literal 5) (nil) nil) (nil) nil)
        (S_If_X 46 (E_Binary_Operation_X 47 Less_Than (E_Name_X 48 (E_Identifier_X 49 ((*I1*) 2) (nil))) (E_Literal_X 50 (Integer_Literal 0) (nil) nil) (nil) nil)
          (S_Assignment_X 51 (E_Identifier_X 52 ((*L2*) 8) (nil)) (E_Literal_X 53 (Integer_Literal 8) (nil) nil))
          S_Null_X
        )
        S_Null_X
      ) 
      (S_Assignment_X 54 (E_Identifier_X 55 ((*O1*) 5) (nil)) (E_Name_X 56 (E_Identifier_X 57 ((*L2*) 8) (nil))))))))))
  )
).

Definition Symbol_Table_X := 
(mkSymbolTable_x
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*L2*) 8), (In_Out, Integer)) :: (((*O1*) 5), (Out, Integer)) :: (((*L1*) 7), (In_Out, Integer)) :: (((*I3*) 4), (In, Integer)) :: (((*I2*) 3), (In, Integer)) :: (((*I1*) 2), (In, Integer)) :: (((*O2*) 6), (Out, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Test_Case_10*) 1), (0, (mkprocedure_body_x 2
  (* = = = Procedure Name = = = *)
  ((*Test_Case_10*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification_x 3 ((*I1*) 2) Integer In) :: 
  (mkparameter_specification_x 4 ((*I2*) 3) Integer In) :: 
  (mkparameter_specification_x 5 ((*I3*) 4) Integer In) :: 
  (mkparameter_specification_x 6 ((*O1*) 5) Integer Out) :: 
  (mkparameter_specification_x 7 ((*O2*) 6) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration_X 8
(D_Object_Declaration_X 9 (mkobject_declaration_x 10 ((*L1*) 7) Integer None)) 
(D_Object_Declaration_X 11 (mkobject_declaration_x 12 ((*L2*) 8) Integer None))))
  (* = = = Procedure Body = = = *)
    (S_Sequence_X 13
    (S_Assignment_X 14 (E_Identifier_X 15 ((*L2*) 8) (nil)) (E_Literal_X 16 (Integer_Literal 5) (nil) nil)) 
    (S_Sequence_X 17
    (S_Assignment_X 18 (E_Identifier_X 19 ((*L1*) 7) (nil)) (E_Name_X 20 (E_Identifier_X 21 ((*I3*) 4) (nil)))) 
    (S_Sequence_X 22
    (S_Assignment_X 23 (E_Identifier_X 24 ((*O2*) 6) (nil)) (E_Name_X 25 (E_Identifier_X 26 ((*L1*) 7) (nil)))) 
    (S_Sequence_X 27
    (S_Assignment_X 28 (E_Identifier_X 29 ((*L1*) 7) (nil)) (E_Name_X 30 (E_Identifier_X 31 ((*I2*) 3) (nil)))) 
    (S_Sequence_X 32
    (S_Assignment_X 33 (E_Identifier_X 34 ((*L1*) 7) (nil)) (E_Binary_Operation_X 35 Plus (E_Name_X 36 (E_Identifier_X 37 ((*I1*) 2) (nil))) (E_Name_X 38 (E_Identifier_X 39 ((*I2*) 3) (nil))) (Do_Overflow_Check :: nil) nil)) 
    (S_Sequence_X 40
    (S_If_X 41 (E_Binary_Operation_X 42 Greater_Than (E_Name_X 43 (E_Identifier_X 44 ((*L1*) 7) (nil))) (E_Literal_X 45 (Integer_Literal 5) (nil) nil) (nil) nil)
      (S_If_X 46 (E_Binary_Operation_X 47 Less_Than (E_Name_X 48 (E_Identifier_X 49 ((*I1*) 2) (nil))) (E_Literal_X 50 (Integer_Literal 0) (nil) nil) (nil) nil)
        (S_Assignment_X 51 (E_Identifier_X 52 ((*L2*) 8) (nil)) (E_Literal_X 53 (Integer_Literal 8) (nil) nil))
        S_Null_X
      )
      S_Null_X
    ) 
    (S_Assignment_X 54 (E_Identifier_X 55 ((*O1*) 5) (nil)) (E_Name_X 56 (E_Identifier_X 57 ((*L2*) 8) (nil))))))))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((50, Integer) :: (53, Integer) :: (35, Integer) :: (44, Integer) :: (26, Integer) :: (56, Integer) :: (29, Integer) :: (38, Integer) :: (47, Boolean) :: (20, Integer) :: (55, Integer) :: (49, Integer) :: (31, Integer) :: (16, Integer) :: (52, Integer) :: (43, Integer) :: (34, Integer) :: (25, Integer) :: (37, Integer) :: (19, Integer) :: (45, Integer) :: (36, Integer) :: (57, Integer) :: (21, Integer) :: (48, Integer) :: (30, Integer) :: (39, Integer) :: (15, Integer) :: (42, Boolean) :: (24, Integer) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((50, (sloc (*Line*)13 (*Col*)21 (*EndLine*)13 (*EndCol*)21)) :: (53, (sloc (*Line*)15 (*Col*)23 (*EndLine*)15 (*EndCol*)23)) :: (35, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)21)) :: (44, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)13)) :: (26, (sloc (*Line*)8 (*Col*)15 (*EndLine*)8 (*EndCol*)16)) :: (56, (sloc (*Line*)19 (*Col*)15 (*EndLine*)19 (*EndCol*)16)) :: (29, (sloc (*Line*)9 (*Col*)9 (*EndLine*)9 (*EndCol*)10)) :: (38, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)21)) :: (47, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)21)) :: (20, (sloc (*Line*)7 (*Col*)15 (*EndLine*)7 (*EndCol*)16)) :: (55, (sloc (*Line*)19 (*Col*)9 (*EndLine*)19 (*EndCol*)10)) :: (49, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)17)) :: (31, (sloc (*Line*)9 (*Col*)15 (*EndLine*)9 (*EndCol*)16)) :: (16, (sloc (*Line*)6 (*Col*)15 (*EndLine*)6 (*EndCol*)15)) :: (52, (sloc (*Line*)15 (*Col*)17 (*EndLine*)15 (*EndCol*)18)) :: (43, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)13)) :: (34, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)10)) :: (25, (sloc (*Line*)8 (*Col*)15 (*EndLine*)8 (*EndCol*)16)) :: (37, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)16)) :: (19, (sloc (*Line*)7 (*Col*)9 (*EndLine*)7 (*EndCol*)10)) :: (45, (sloc (*Line*)11 (*Col*)17 (*EndLine*)11 (*EndCol*)17)) :: (36, (sloc (*Line*)10 (*Col*)15 (*EndLine*)10 (*EndCol*)16)) :: (57, (sloc (*Line*)19 (*Col*)15 (*EndLine*)19 (*EndCol*)16)) :: (21, (sloc (*Line*)7 (*Col*)15 (*EndLine*)7 (*EndCol*)16)) :: (48, (sloc (*Line*)13 (*Col*)16 (*EndLine*)13 (*EndCol*)17)) :: (30, (sloc (*Line*)9 (*Col*)15 (*EndLine*)9 (*EndCol*)16)) :: (39, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)21)) :: (15, (sloc (*Line*)6 (*Col*)9 (*EndLine*)6 (*EndCol*)10)) :: (42, (sloc (*Line*)11 (*Col*)12 (*EndLine*)11 (*EndCol*)17)) :: (24, (sloc (*Line*)8 (*Col*)9 (*EndLine*)8 (*EndCol*)10)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((8, ("L2", "ada://variable/Test_Case_10+1:15/L2+4:8")) :: (2, ("I1", "ada://parameter/Test_Case_10+1:15/I1+1:29")) :: (5, ("O1", "ada://parameter/Test_Case_10+1:15/O1+1:78")) :: (4, ("I3", "ada://parameter/Test_Case_10+1:15/I3+1:61")) :: (7, ("L1", "ada://variable/Test_Case_10+1:15/L1+3:8")) :: (3, ("I2", "ada://parameter/Test_Case_10+1:15/I2+1:45")) :: (6, ("O2", "ada://parameter/Test_Case_10+1:15/O2+1:95")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Test_Case_10", "ada://procedure_body/Test_Case_10+1:15")) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) package names map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) type names map = = = *)
  (*/////////////////////////////////////*)
  (nil)
))
).

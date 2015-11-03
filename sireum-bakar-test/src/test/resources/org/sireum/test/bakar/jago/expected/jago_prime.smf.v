Require Import String.
Require Import symboltable.
Open Scope string_scope.

Definition Coq_AST_Tree := 
(D_Procedure_Body 1 
  (mkprocedure_body 2
    (* = = = Procedure Name = = = *)
    ((*Prime*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification 3 ((*N*) 2) Integer In) :: 
    (mkparameter_specification 4 ((*R*) 3) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration 5
  (D_Object_Declaration 6 (mkobject_declaration 7 ((*Result*) 4) Integer None)) 
  (D_Seq_Declaration 8
  (D_Object_Declaration 9 (mkobject_declaration 10 ((*I*) 5) Integer None)) 
  (D_Object_Declaration 11 (mkobject_declaration 12 ((*T*) 6) Integer None)))))
    (* = = = Procedure Body = = = *)
      (S_Sequence 13
      (S_Assignment 14 (E_Identifier 15 ((*Result*) 4) ) (E_Literal 16 (Integer_Literal 0) )) 
      (S_Sequence 17
      (S_If 18 (E_Binary_Operation 19 Or (E_Binary_Operation 20 Equal (E_Name 21 (E_Identifier 22 ((*N*) 2) )) (E_Literal 23 (Integer_Literal 1) ) ) (E_Binary_Operation 24 Equal (E_Name 25 (E_Identifier 26 ((*N*) 2) )) (E_Literal 27 (Integer_Literal 2) ) ) )
        (S_Assignment 28 (E_Identifier 29 ((*Result*) 4) ) (E_Literal 30 (Integer_Literal 1) ))
        S_Null
      ) 
      (S_Sequence 31
      (S_Assignment 32 (E_Identifier 33 ((*I*) 5) ) (E_Literal 34 (Integer_Literal 2) )) 
      (S_Sequence 35
      (S_While_Loop 36 (E_Binary_Operation 37 And (E_Binary_Operation 38 Less_Than (E_Name 39 (E_Identifier 40 ((*I*) 5) )) (E_Name 41 (E_Identifier 42 ((*N*) 2) )) ) (E_Binary_Operation 43 Equal (E_Name 44 (E_Identifier 45 ((*Result*) 4) )) (E_Literal 46 (Integer_Literal 0) ) ) )
        (S_Sequence 47
        (S_Assignment 48 (E_Identifier 49 ((*T*) 6) ) (E_Binary_Operation 50 Divide (E_Name 51 (E_Identifier 52 ((*N*) 2) )) (E_Name 53 (E_Identifier 54 ((*I*) 5) )) )) 
        (S_If 55 (E_Binary_Operation 56 Equal (E_Name 57 (E_Identifier 58 ((*N*) 2) )) (E_Binary_Operation 59 Multiply (E_Name 60 (E_Identifier 61 ((*T*) 6) )) (E_Name 62 (E_Identifier 63 ((*I*) 5) )) ) )
          (S_Assignment 64 (E_Identifier 65 ((*Result*) 4) ) (E_Literal 66 (Integer_Literal 1) ))
          S_Null
        ))
      ) 
      (S_Assignment 67 (E_Identifier 68 ((*R*) 3) ) (E_Name 69 (E_Identifier 70 ((*Result*) 4) )))))))
  )
).

Definition Symbol_Table := 
(mkSymbolTable
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*I*) 5), (In_Out, Integer)) :: (((*N*) 2), (In, Integer)) :: (((*R*) 3), (Out, Integer)) :: (((*Result*) 4), (In_Out, Integer)) :: (((*T*) 6), (In_Out, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Prime*) 1), (0, (mkprocedure_body 2
  (* = = = Procedure Name = = = *)
  ((*Prime*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification 3 ((*N*) 2) Integer In) :: 
  (mkparameter_specification 4 ((*R*) 3) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration 5
(D_Object_Declaration 6 (mkobject_declaration 7 ((*Result*) 4) Integer None)) 
(D_Seq_Declaration 8
(D_Object_Declaration 9 (mkobject_declaration 10 ((*I*) 5) Integer None)) 
(D_Object_Declaration 11 (mkobject_declaration 12 ((*T*) 6) Integer None)))))
  (* = = = Procedure Body = = = *)
    (S_Sequence 13
    (S_Assignment 14 (E_Identifier 15 ((*Result*) 4) ) (E_Literal 16 (Integer_Literal 0) )) 
    (S_Sequence 17
    (S_If 18 (E_Binary_Operation 19 Or (E_Binary_Operation 20 Equal (E_Name 21 (E_Identifier 22 ((*N*) 2) )) (E_Literal 23 (Integer_Literal 1) ) ) (E_Binary_Operation 24 Equal (E_Name 25 (E_Identifier 26 ((*N*) 2) )) (E_Literal 27 (Integer_Literal 2) ) ) )
      (S_Assignment 28 (E_Identifier 29 ((*Result*) 4) ) (E_Literal 30 (Integer_Literal 1) ))
      S_Null
    ) 
    (S_Sequence 31
    (S_Assignment 32 (E_Identifier 33 ((*I*) 5) ) (E_Literal 34 (Integer_Literal 2) )) 
    (S_Sequence 35
    (S_While_Loop 36 (E_Binary_Operation 37 And (E_Binary_Operation 38 Less_Than (E_Name 39 (E_Identifier 40 ((*I*) 5) )) (E_Name 41 (E_Identifier 42 ((*N*) 2) )) ) (E_Binary_Operation 43 Equal (E_Name 44 (E_Identifier 45 ((*Result*) 4) )) (E_Literal 46 (Integer_Literal 0) ) ) )
      (S_Sequence 47
      (S_Assignment 48 (E_Identifier 49 ((*T*) 6) ) (E_Binary_Operation 50 Divide (E_Name 51 (E_Identifier 52 ((*N*) 2) )) (E_Name 53 (E_Identifier 54 ((*I*) 5) )) )) 
      (S_If 55 (E_Binary_Operation 56 Equal (E_Name 57 (E_Identifier 58 ((*N*) 2) )) (E_Binary_Operation 59 Multiply (E_Name 60 (E_Identifier 61 ((*T*) 6) )) (E_Name 62 (E_Identifier 63 ((*I*) 5) )) ) )
        (S_Assignment 64 (E_Identifier 65 ((*Result*) 4) ) (E_Literal 66 (Integer_Literal 1) ))
        S_Null
      ))
    ) 
    (S_Assignment 67 (E_Identifier 68 ((*R*) 3) ) (E_Name 69 (E_Identifier 70 ((*Result*) 4) )))))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((23, Integer) :: (68, Integer) :: (59, Integer) :: (50, Integer) :: (41, Integer) :: (62, Integer) :: (53, Integer) :: (44, Integer) :: (26, Integer) :: (56, Boolean) :: (29, Integer) :: (38, Boolean) :: (20, Boolean) :: (65, Integer) :: (46, Integer) :: (58, Integer) :: (49, Integer) :: (40, Integer) :: (22, Integer) :: (16, Integer) :: (70, Integer) :: (52, Integer) :: (43, Boolean) :: (25, Integer) :: (34, Integer) :: (61, Integer) :: (37, Boolean) :: (19, Boolean) :: (60, Integer) :: (69, Integer) :: (63, Integer) :: (54, Integer) :: (45, Integer) :: (27, Integer) :: (57, Integer) :: (21, Integer) :: (30, Integer) :: (39, Integer) :: (66, Integer) :: (15, Integer) :: (42, Integer) :: (51, Integer) :: (24, Boolean) :: (33, Integer) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((23, (sloc (*Line*)10 (*Col*)11 (*EndLine*)10 (*EndCol*)11)) :: (68, (sloc (*Line*)20 (*Col*)4 (*EndLine*)20 (*EndCol*)4)) :: (59, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)18)) :: (50, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)16)) :: (41, (sloc (*Line*)14 (*Col*)14 (*EndLine*)14 (*EndCol*)14)) :: (62, (sloc (*Line*)16 (*Col*)18 (*EndLine*)16 (*EndCol*)18)) :: (53, (sloc (*Line*)15 (*Col*)16 (*EndLine*)15 (*EndCol*)16)) :: (44, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)25)) :: (26, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)16)) :: (56, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)18)) :: (29, (sloc (*Line*)11 (*Col*)7 (*EndLine*)11 (*EndCol*)12)) :: (38, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)14)) :: (20, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)11)) :: (65, (sloc (*Line*)17 (*Col*)3 (*EndLine*)17 (*EndCol*)8)) :: (46, (sloc (*Line*)14 (*Col*)29 (*EndLine*)14 (*EndCol*)29)) :: (58, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)10)) :: (49, (sloc (*Line*)15 (*Col*)7 (*EndLine*)15 (*EndCol*)7)) :: (40, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)10)) :: (22, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)7)) :: (16, (sloc (*Line*)9 (*Col*)14 (*EndLine*)9 (*EndCol*)14)) :: (70, (sloc (*Line*)20 (*Col*)9 (*EndLine*)20 (*EndCol*)14)) :: (52, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)12)) :: (43, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)29)) :: (25, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)16)) :: (34, (sloc (*Line*)13 (*Col*)9 (*EndLine*)13 (*EndCol*)9)) :: (61, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)14)) :: (37, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)29)) :: (19, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)20)) :: (60, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)14)) :: (69, (sloc (*Line*)20 (*Col*)9 (*EndLine*)20 (*EndCol*)14)) :: (63, (sloc (*Line*)16 (*Col*)18 (*EndLine*)16 (*EndCol*)18)) :: (54, (sloc (*Line*)15 (*Col*)16 (*EndLine*)15 (*EndCol*)16)) :: (45, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)25)) :: (27, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)20)) :: (57, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)10)) :: (21, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)7)) :: (30, (sloc (*Line*)11 (*Col*)17 (*EndLine*)11 (*EndCol*)17)) :: (39, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)10)) :: (66, (sloc (*Line*)17 (*Col*)13 (*EndLine*)17 (*EndCol*)13)) :: (15, (sloc (*Line*)9 (*Col*)4 (*EndLine*)9 (*EndCol*)9)) :: (42, (sloc (*Line*)14 (*Col*)14 (*EndLine*)14 (*EndCol*)14)) :: (51, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)12)) :: (24, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)20)) :: (33, (sloc (*Line*)13 (*Col*)4 (*EndLine*)13 (*EndCol*)4)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((2, ("N", "ada://parameter/Prime+1:11/N+1:18")) :: (5, ("I", "ada://variable/Prime+1:11/I+4:4")) :: (4, ("Result", "ada://variable/Prime+1:11/Result+3:4")) :: (3, ("R", "ada://parameter/Prime+1:11/R+1:31")) :: (6, ("T", "ada://variable/Prime+1:11/T+5:4")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Prime", "ada://procedure_body/Prime+1:11")) :: nil)
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
    ((*Prime*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification_x 3 ((*N*) 2) Integer In) :: 
    (mkparameter_specification_x 4 ((*R*) 3) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration_X 5
  (D_Object_Declaration_X 6 (mkobject_declaration_x 7 ((*Result*) 4) Integer None)) 
  (D_Seq_Declaration_X 8
  (D_Object_Declaration_X 9 (mkobject_declaration_x 10 ((*I*) 5) Integer None)) 
  (D_Object_Declaration_X 11 (mkobject_declaration_x 12 ((*T*) 6) Integer None)))))
    (* = = = Procedure Body = = = *)
      (S_Sequence_X 13
      (S_Assignment_X 14 (E_Identifier_X 15 ((*Result*) 4) (nil)) (E_Literal_X 16 (Integer_Literal 0) (nil) nil)) 
      (S_Sequence_X 17
      (S_If_X 18 (E_Binary_Operation_X 19 Or (E_Binary_Operation_X 20 Equal (E_Name_X 21 (E_Identifier_X 22 ((*N*) 2) (nil))) (E_Literal_X 23 (Integer_Literal 1) (nil) nil) (nil) nil) (E_Binary_Operation_X 24 Equal (E_Name_X 25 (E_Identifier_X 26 ((*N*) 2) (nil))) (E_Literal_X 27 (Integer_Literal 2) (nil) nil) (nil) nil) (nil) nil)
        (S_Assignment_X 28 (E_Identifier_X 29 ((*Result*) 4) (nil)) (E_Literal_X 30 (Integer_Literal 1) (nil) nil))
        S_Null_X
      ) 
      (S_Sequence_X 31
      (S_Assignment_X 32 (E_Identifier_X 33 ((*I*) 5) (nil)) (E_Literal_X 34 (Integer_Literal 2) (nil) nil)) 
      (S_Sequence_X 35
      (S_While_Loop_X 36 (E_Binary_Operation_X 37 And (E_Binary_Operation_X 38 Less_Than (E_Name_X 39 (E_Identifier_X 40 ((*I*) 5) (nil))) (E_Name_X 41 (E_Identifier_X 42 ((*N*) 2) (nil))) (nil) nil) (E_Binary_Operation_X 43 Equal (E_Name_X 44 (E_Identifier_X 45 ((*Result*) 4) (nil))) (E_Literal_X 46 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
        (S_Sequence_X 47
        (S_Assignment_X 48 (E_Identifier_X 49 ((*T*) 6) (nil)) (E_Binary_Operation_X 50 Divide (E_Name_X 51 (E_Identifier_X 52 ((*N*) 2) (nil))) (E_Name_X 53 (E_Identifier_X 54 ((*I*) 5) (nil))) (Do_Division_Check :: Do_Overflow_Check :: nil) nil)) 
        (S_If_X 55 (E_Binary_Operation_X 56 Equal (E_Name_X 57 (E_Identifier_X 58 ((*N*) 2) (nil))) (E_Binary_Operation_X 59 Multiply (E_Name_X 60 (E_Identifier_X 61 ((*T*) 6) (nil))) (E_Name_X 62 (E_Identifier_X 63 ((*I*) 5) (nil))) (Do_Overflow_Check :: nil) nil) (nil) nil)
          (S_Assignment_X 64 (E_Identifier_X 65 ((*Result*) 4) (nil)) (E_Literal_X 66 (Integer_Literal 1) (nil) nil))
          S_Null_X
        ))
      ) 
      (S_Assignment_X 67 (E_Identifier_X 68 ((*R*) 3) (nil)) (E_Name_X 69 (E_Identifier_X 70 ((*Result*) 4) (nil))))))))
  )
).

Definition Symbol_Table_X := 
(mkSymbolTable_x
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*I*) 5), (In_Out, Integer)) :: (((*N*) 2), (In, Integer)) :: (((*R*) 3), (Out, Integer)) :: (((*Result*) 4), (In_Out, Integer)) :: (((*T*) 6), (In_Out, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Prime*) 1), (0, (mkprocedure_body_x 2
  (* = = = Procedure Name = = = *)
  ((*Prime*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification_x 3 ((*N*) 2) Integer In) :: 
  (mkparameter_specification_x 4 ((*R*) 3) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration_X 5
(D_Object_Declaration_X 6 (mkobject_declaration_x 7 ((*Result*) 4) Integer None)) 
(D_Seq_Declaration_X 8
(D_Object_Declaration_X 9 (mkobject_declaration_x 10 ((*I*) 5) Integer None)) 
(D_Object_Declaration_X 11 (mkobject_declaration_x 12 ((*T*) 6) Integer None)))))
  (* = = = Procedure Body = = = *)
    (S_Sequence_X 13
    (S_Assignment_X 14 (E_Identifier_X 15 ((*Result*) 4) (nil)) (E_Literal_X 16 (Integer_Literal 0) (nil) nil)) 
    (S_Sequence_X 17
    (S_If_X 18 (E_Binary_Operation_X 19 Or (E_Binary_Operation_X 20 Equal (E_Name_X 21 (E_Identifier_X 22 ((*N*) 2) (nil))) (E_Literal_X 23 (Integer_Literal 1) (nil) nil) (nil) nil) (E_Binary_Operation_X 24 Equal (E_Name_X 25 (E_Identifier_X 26 ((*N*) 2) (nil))) (E_Literal_X 27 (Integer_Literal 2) (nil) nil) (nil) nil) (nil) nil)
      (S_Assignment_X 28 (E_Identifier_X 29 ((*Result*) 4) (nil)) (E_Literal_X 30 (Integer_Literal 1) (nil) nil))
      S_Null_X
    ) 
    (S_Sequence_X 31
    (S_Assignment_X 32 (E_Identifier_X 33 ((*I*) 5) (nil)) (E_Literal_X 34 (Integer_Literal 2) (nil) nil)) 
    (S_Sequence_X 35
    (S_While_Loop_X 36 (E_Binary_Operation_X 37 And (E_Binary_Operation_X 38 Less_Than (E_Name_X 39 (E_Identifier_X 40 ((*I*) 5) (nil))) (E_Name_X 41 (E_Identifier_X 42 ((*N*) 2) (nil))) (nil) nil) (E_Binary_Operation_X 43 Equal (E_Name_X 44 (E_Identifier_X 45 ((*Result*) 4) (nil))) (E_Literal_X 46 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
      (S_Sequence_X 47
      (S_Assignment_X 48 (E_Identifier_X 49 ((*T*) 6) (nil)) (E_Binary_Operation_X 50 Divide (E_Name_X 51 (E_Identifier_X 52 ((*N*) 2) (nil))) (E_Name_X 53 (E_Identifier_X 54 ((*I*) 5) (nil))) (Do_Division_Check :: Do_Overflow_Check :: nil) nil)) 
      (S_If_X 55 (E_Binary_Operation_X 56 Equal (E_Name_X 57 (E_Identifier_X 58 ((*N*) 2) (nil))) (E_Binary_Operation_X 59 Multiply (E_Name_X 60 (E_Identifier_X 61 ((*T*) 6) (nil))) (E_Name_X 62 (E_Identifier_X 63 ((*I*) 5) (nil))) (Do_Overflow_Check :: nil) nil) (nil) nil)
        (S_Assignment_X 64 (E_Identifier_X 65 ((*Result*) 4) (nil)) (E_Literal_X 66 (Integer_Literal 1) (nil) nil))
        S_Null_X
      ))
    ) 
    (S_Assignment_X 67 (E_Identifier_X 68 ((*R*) 3) (nil)) (E_Name_X 69 (E_Identifier_X 70 ((*Result*) 4) (nil))))))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((23, Integer) :: (68, Integer) :: (59, Integer) :: (50, Integer) :: (41, Integer) :: (62, Integer) :: (53, Integer) :: (44, Integer) :: (26, Integer) :: (56, Boolean) :: (29, Integer) :: (38, Boolean) :: (20, Boolean) :: (65, Integer) :: (46, Integer) :: (58, Integer) :: (49, Integer) :: (40, Integer) :: (22, Integer) :: (16, Integer) :: (70, Integer) :: (52, Integer) :: (43, Boolean) :: (25, Integer) :: (34, Integer) :: (61, Integer) :: (37, Boolean) :: (19, Boolean) :: (60, Integer) :: (69, Integer) :: (63, Integer) :: (54, Integer) :: (45, Integer) :: (27, Integer) :: (57, Integer) :: (21, Integer) :: (30, Integer) :: (39, Integer) :: (66, Integer) :: (15, Integer) :: (42, Integer) :: (51, Integer) :: (24, Boolean) :: (33, Integer) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((23, (sloc (*Line*)10 (*Col*)11 (*EndLine*)10 (*EndCol*)11)) :: (68, (sloc (*Line*)20 (*Col*)4 (*EndLine*)20 (*EndCol*)4)) :: (59, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)18)) :: (50, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)16)) :: (41, (sloc (*Line*)14 (*Col*)14 (*EndLine*)14 (*EndCol*)14)) :: (62, (sloc (*Line*)16 (*Col*)18 (*EndLine*)16 (*EndCol*)18)) :: (53, (sloc (*Line*)15 (*Col*)16 (*EndLine*)15 (*EndCol*)16)) :: (44, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)25)) :: (26, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)16)) :: (56, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)18)) :: (29, (sloc (*Line*)11 (*Col*)7 (*EndLine*)11 (*EndCol*)12)) :: (38, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)14)) :: (20, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)11)) :: (65, (sloc (*Line*)17 (*Col*)3 (*EndLine*)17 (*EndCol*)8)) :: (46, (sloc (*Line*)14 (*Col*)29 (*EndLine*)14 (*EndCol*)29)) :: (58, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)10)) :: (49, (sloc (*Line*)15 (*Col*)7 (*EndLine*)15 (*EndCol*)7)) :: (40, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)10)) :: (22, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)7)) :: (16, (sloc (*Line*)9 (*Col*)14 (*EndLine*)9 (*EndCol*)14)) :: (70, (sloc (*Line*)20 (*Col*)9 (*EndLine*)20 (*EndCol*)14)) :: (52, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)12)) :: (43, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)29)) :: (25, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)16)) :: (34, (sloc (*Line*)13 (*Col*)9 (*EndLine*)13 (*EndCol*)9)) :: (61, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)14)) :: (37, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)29)) :: (19, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)20)) :: (60, (sloc (*Line*)16 (*Col*)14 (*EndLine*)16 (*EndCol*)14)) :: (69, (sloc (*Line*)20 (*Col*)9 (*EndLine*)20 (*EndCol*)14)) :: (63, (sloc (*Line*)16 (*Col*)18 (*EndLine*)16 (*EndCol*)18)) :: (54, (sloc (*Line*)15 (*Col*)16 (*EndLine*)15 (*EndCol*)16)) :: (45, (sloc (*Line*)14 (*Col*)20 (*EndLine*)14 (*EndCol*)25)) :: (27, (sloc (*Line*)10 (*Col*)20 (*EndLine*)10 (*EndCol*)20)) :: (57, (sloc (*Line*)16 (*Col*)10 (*EndLine*)16 (*EndCol*)10)) :: (21, (sloc (*Line*)10 (*Col*)7 (*EndLine*)10 (*EndCol*)7)) :: (30, (sloc (*Line*)11 (*Col*)17 (*EndLine*)11 (*EndCol*)17)) :: (39, (sloc (*Line*)14 (*Col*)10 (*EndLine*)14 (*EndCol*)10)) :: (66, (sloc (*Line*)17 (*Col*)13 (*EndLine*)17 (*EndCol*)13)) :: (15, (sloc (*Line*)9 (*Col*)4 (*EndLine*)9 (*EndCol*)9)) :: (42, (sloc (*Line*)14 (*Col*)14 (*EndLine*)14 (*EndCol*)14)) :: (51, (sloc (*Line*)15 (*Col*)12 (*EndLine*)15 (*EndCol*)12)) :: (24, (sloc (*Line*)10 (*Col*)16 (*EndLine*)10 (*EndCol*)20)) :: (33, (sloc (*Line*)13 (*Col*)4 (*EndLine*)13 (*EndCol*)4)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((2, ("N", "ada://parameter/Prime+1:11/N+1:18")) :: (5, ("I", "ada://variable/Prime+1:11/I+4:4")) :: (4, ("Result", "ada://variable/Prime+1:11/Result+3:4")) :: (3, ("R", "ada://parameter/Prime+1:11/R+1:31")) :: (6, ("T", "ada://variable/Prime+1:11/T+5:4")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Prime", "ada://procedure_body/Prime+1:11")) :: nil)
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

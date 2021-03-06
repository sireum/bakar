Require Import String.
Require Import symboltable.
Open Scope string_scope.

Definition Coq_AST_Tree := 
(D_Procedure_Body 1 
  (mkprocedure_body 2
    (* = = = Procedure Name = = = *)
    ((*Max*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification 3 ((*X*) 2) Integer In) :: 
    (mkparameter_specification 4 ((*Y*) 3) Integer In) :: 
    (mkparameter_specification 5 ((*R*) 4) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Object_Declaration 6 (mkobject_declaration 7 ((*Result*) 5) Integer None)))
    (* = = = Procedure Body = = = *)
      (S_Sequence 8
      (S_Assignment 9 (E_Identifier 10 ((*Result*) 5) ) (E_Name 11 (E_Identifier 12 ((*Y*) 3) ))) 
      (S_Sequence 13
      (S_If 14 (E_Binary_Operation 15 Greater_Than (E_Name 16 (E_Identifier 17 ((*X*) 2) )) (E_Name 18 (E_Identifier 19 ((*Y*) 3) )) )
        (S_Assignment 20 (E_Identifier 21 ((*Result*) 5) ) (E_Name 22 (E_Identifier 23 ((*X*) 2) )))
        S_Null
      ) 
      (S_Assignment 24 (E_Identifier 25 ((*R*) 4) ) (E_Name 26 (E_Identifier 27 ((*Result*) 5) )))))
  )
).

Definition Symbol_Table := 
(mkSymbolTable
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*X*) 2), (In, Integer)) :: (((*R*) 4), (Out, Integer)) :: (((*Result*) 5), (In_Out, Integer)) :: (((*Y*) 3), (In, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Max*) 1), (0, (mkprocedure_body 2
  (* = = = Procedure Name = = = *)
  ((*Max*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification 3 ((*X*) 2) Integer In) :: 
  (mkparameter_specification 4 ((*Y*) 3) Integer In) :: 
  (mkparameter_specification 5 ((*R*) 4) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Object_Declaration 6 (mkobject_declaration 7 ((*Result*) 5) Integer None)))
  (* = = = Procedure Body = = = *)
    (S_Sequence 8
    (S_Assignment 9 (E_Identifier 10 ((*Result*) 5) ) (E_Name 11 (E_Identifier 12 ((*Y*) 3) ))) 
    (S_Sequence 13
    (S_If 14 (E_Binary_Operation 15 Greater_Than (E_Name 16 (E_Identifier 17 ((*X*) 2) )) (E_Name 18 (E_Identifier 19 ((*Y*) 3) )) )
      (S_Assignment 20 (E_Identifier 21 ((*Result*) 5) ) (E_Name 22 (E_Identifier 23 ((*X*) 2) )))
      S_Null
    ) 
    (S_Assignment 24 (E_Identifier 25 ((*R*) 4) ) (E_Name 26 (E_Identifier 27 ((*Result*) 5) )))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((23, Integer) :: (17, Integer) :: (26, Integer) :: (11, Integer) :: (22, Integer) :: (16, Integer) :: (25, Integer) :: (10, Integer) :: (19, Integer) :: (27, Integer) :: (18, Integer) :: (12, Integer) :: (21, Integer) :: (15, Boolean) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((23, (sloc (*Line*)8 (*Col*)17 (*EndLine*)8 (*EndCol*)17)) :: (17, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)7)) :: (26, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)14)) :: (11, (sloc (*Line*)6 (*Col*)14 (*EndLine*)6 (*EndCol*)14)) :: (22, (sloc (*Line*)8 (*Col*)17 (*EndLine*)8 (*EndCol*)17)) :: (16, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)7)) :: (25, (sloc (*Line*)10 (*Col*)4 (*EndLine*)10 (*EndCol*)4)) :: (10, (sloc (*Line*)6 (*Col*)4 (*EndLine*)6 (*EndCol*)9)) :: (19, (sloc (*Line*)7 (*Col*)11 (*EndLine*)7 (*EndCol*)11)) :: (27, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)14)) :: (18, (sloc (*Line*)7 (*Col*)11 (*EndLine*)7 (*EndCol*)11)) :: (12, (sloc (*Line*)6 (*Col*)14 (*EndLine*)6 (*EndCol*)14)) :: (21, (sloc (*Line*)8 (*Col*)7 (*EndLine*)8 (*EndCol*)12)) :: (15, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)11)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((2, ("X", "ada://parameter/Max+1:11/X+1:16")) :: (5, ("Result", "ada://variable/Max+1:11/Result+3:4")) :: (4, ("R", "ada://parameter/Max+1:11/R+1:42")) :: (3, ("Y", "ada://parameter/Max+1:11/Y+1:29")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Max", "ada://procedure_body/Max+1:11")) :: nil)
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
    ((*Max*) 1)
    (* = = = Formal Parameters = = = *)
    (
    (mkparameter_specification_x 3 ((*X*) 2) Integer In) :: 
    (mkparameter_specification_x 4 ((*Y*) 3) Integer In) :: 
    (mkparameter_specification_x 5 ((*R*) 4) Integer Out) :: nil)
    (* = = = Object Declarations = = = *)
    ((D_Object_Declaration_X 6 (mkobject_declaration_x 7 ((*Result*) 5) Integer None)))
    (* = = = Procedure Body = = = *)
      (S_Sequence_X 8
      (S_Assignment_X 9 (E_Identifier_X 10 ((*Result*) 5) (nil)) (E_Name_X 11 (E_Identifier_X 12 ((*Y*) 3) (nil)))) 
      (S_Sequence_X 13
      (S_If_X 14 (E_Binary_Operation_X 15 Greater_Than (E_Name_X 16 (E_Identifier_X 17 ((*X*) 2) (nil))) (E_Name_X 18 (E_Identifier_X 19 ((*Y*) 3) (nil))) (nil) nil)
        (S_Assignment_X 20 (E_Identifier_X 21 ((*Result*) 5) (nil)) (E_Name_X 22 (E_Identifier_X 23 ((*X*) 2) (nil))))
        S_Null_X
      ) 
      (S_Assignment_X 24 (E_Identifier_X 25 ((*R*) 4) (nil)) (E_Name_X 26 (E_Identifier_X 27 ((*Result*) 5) (nil))))))
  )
).

Definition Symbol_Table_X := 
(mkSymbolTable_x
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*X*) 2), (In, Integer)) :: (((*R*) 4), (Out, Integer)) :: (((*Result*) 5), (In_Out, Integer)) :: (((*Y*) 3), (In, Integer)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*Max*) 1), (0, (mkprocedure_body_x 2
  (* = = = Procedure Name = = = *)
  ((*Max*) 1)
  (* = = = Formal Parameters = = = *)
  (
  (mkparameter_specification_x 3 ((*X*) 2) Integer In) :: 
  (mkparameter_specification_x 4 ((*Y*) 3) Integer In) :: 
  (mkparameter_specification_x 5 ((*R*) 4) Integer Out) :: nil)
  (* = = = Object Declarations = = = *)
  ((D_Object_Declaration_X 6 (mkobject_declaration_x 7 ((*Result*) 5) Integer None)))
  (* = = = Procedure Body = = = *)
    (S_Sequence_X 8
    (S_Assignment_X 9 (E_Identifier_X 10 ((*Result*) 5) (nil)) (E_Name_X 11 (E_Identifier_X 12 ((*Y*) 3) (nil)))) 
    (S_Sequence_X 13
    (S_If_X 14 (E_Binary_Operation_X 15 Greater_Than (E_Name_X 16 (E_Identifier_X 17 ((*X*) 2) (nil))) (E_Name_X 18 (E_Identifier_X 19 ((*Y*) 3) (nil))) (nil) nil)
      (S_Assignment_X 20 (E_Identifier_X 21 ((*Result*) 5) (nil)) (E_Name_X 22 (E_Identifier_X 23 ((*X*) 2) (nil))))
      S_Null_X
    ) 
    (S_Assignment_X 24 (E_Identifier_X 25 ((*R*) 4) (nil)) (E_Name_X 26 (E_Identifier_X 27 ((*Result*) 5) (nil))))))
))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((23, Integer) :: (17, Integer) :: (26, Integer) :: (11, Integer) :: (22, Integer) :: (16, Integer) :: (25, Integer) :: (10, Integer) :: (19, Integer) :: (27, Integer) :: (18, Integer) :: (12, Integer) :: (21, Integer) :: (15, Boolean) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((23, (sloc (*Line*)8 (*Col*)17 (*EndLine*)8 (*EndCol*)17)) :: (17, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)7)) :: (26, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)14)) :: (11, (sloc (*Line*)6 (*Col*)14 (*EndLine*)6 (*EndCol*)14)) :: (22, (sloc (*Line*)8 (*Col*)17 (*EndLine*)8 (*EndCol*)17)) :: (16, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)7)) :: (25, (sloc (*Line*)10 (*Col*)4 (*EndLine*)10 (*EndCol*)4)) :: (10, (sloc (*Line*)6 (*Col*)4 (*EndLine*)6 (*EndCol*)9)) :: (19, (sloc (*Line*)7 (*Col*)11 (*EndLine*)7 (*EndCol*)11)) :: (27, (sloc (*Line*)10 (*Col*)9 (*EndLine*)10 (*EndCol*)14)) :: (18, (sloc (*Line*)7 (*Col*)11 (*EndLine*)7 (*EndCol*)11)) :: (12, (sloc (*Line*)6 (*Col*)14 (*EndLine*)6 (*EndCol*)14)) :: (21, (sloc (*Line*)8 (*Col*)7 (*EndLine*)8 (*EndCol*)12)) :: (15, (sloc (*Line*)7 (*Col*)7 (*EndLine*)7 (*EndCol*)11)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((2, ("X", "ada://parameter/Max+1:11/X+1:16")) :: (5, ("Result", "ada://variable/Max+1:11/Result+3:4")) :: (4, ("R", "ada://parameter/Max+1:11/R+1:42")) :: (3, ("Y", "ada://parameter/Max+1:11/Y+1:29")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((1, ("Max", "ada://procedure_body/Max+1:11")) :: nil)
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


Require Import String.
Require Import symboltable.
Open Scope string_scope.

Definition Coq_AST_Tree := 
(D_Seq_Declaration 1
(D_Seq_Declaration 2
(D_Type_Declaration 3 (Subtype_Declaration 4 ((*FILE_NUM*) 1) Integer (Range 1 5))) 
(D_Seq_Declaration 5
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 6
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 7
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 8
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 9
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 10
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 11
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 12
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 13
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 14
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 15
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 16
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 17
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 18
D_Null_Declaration (* Undefined Declarations ! *) 
D_Null_Declaration (* Undefined Declarations ! *)))))))))))))))) 
(D_Procedure_Body 19 
  (mkprocedure_body 20
    (* = = = Procedure Name = = = *)
    ((*ACATS_C53007A*) 17)
    (* = = = Formal Parameters = = = *)
    (nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration 21
  D_Null_Declaration (* Undefined Declarations ! *) 
  (D_Seq_Declaration 22
  (D_Object_Declaration 24 (mkobject_declaration 25 ((*CI1*) 19) Integer (Some ((E_Literal 23 (Integer_Literal 1) ))))) 
  (D_Seq_Declaration 26
  (D_Object_Declaration 28 (mkobject_declaration 29 ((*CI9*) 20) Integer (Some ((E_Literal 27 (Integer_Literal 9) ))))) 
  (D_Seq_Declaration 30
  (D_Object_Declaration 32 (mkobject_declaration 33 ((*CBT*) 22) Boolean (Some ((E_Literal 31 (Boolean_Literal true) ))))) 
  (D_Seq_Declaration 34
  (D_Object_Declaration 36 (mkobject_declaration 37 ((*CBF*) 23) Boolean (Some ((E_Literal 35 (Boolean_Literal false) ))))) 
  (D_Seq_Declaration 38
  (D_Object_Declaration 40 (mkobject_declaration 41 ((*VI1*) 24) Integer (Some ((E_Literal 39 (Integer_Literal 1) ))))) 
  (D_Seq_Declaration 42
  (D_Object_Declaration 44 (mkobject_declaration 45 ((*VI9*) 25) Integer (Some ((E_Literal 43 (Integer_Literal 9) ))))) 
  (D_Seq_Declaration 46
  (D_Object_Declaration 48 (mkobject_declaration 49 ((*VBT*) 26) Boolean (Some ((E_Literal 47 (Boolean_Literal true) ))))) 
  (D_Seq_Declaration 50
  (D_Object_Declaration 52 (mkobject_declaration 53 ((*VBF*) 27) Boolean (Some ((E_Literal 51 (Boolean_Literal false) ))))) 
  (D_Object_Declaration 55 (mkobject_declaration 56 ((*FLOW_COUNT*) 28) Integer (Some ((E_Literal 54 (Integer_Literal 0) )))))))))))))))
    (* = = = Procedure Body = = = *)
      (S_Sequence 57
      S_Null (* arguments of procedure call are unrecognized ! *) 
      (S_Sequence 60
      (S_If 61 (E_Name 62 (E_Identifier 63 ((*VBF*) 27) ))
        S_Null (* arguments of procedure call are unrecognized ! *)
        (S_If 66 (E_Binary_Operation 67 Less_Than (E_Name 68 (E_Identifier 69 ((*CI9*) 20) )) (E_Literal 70 (Integer_Literal 20) ) )
          (S_Sequence 71
          (S_Assignment 72 (E_Identifier 73 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 74 Plus (E_Name 75 (E_Identifier 76 ((*FLOW_COUNT*) 28) )) (E_Literal 77 (Integer_Literal 1) ) )) 
          (S_If 78 (E_Binary_Operation 79 And (E_Binary_Operation 80 Not_Equal (E_Name 81 (E_Identifier 82 ((*VI1*) 24) )) (E_Literal 83 (Integer_Literal 0) ) ) (E_Literal 84 (Boolean_Literal true) ) )
            (S_Assignment 85 (E_Identifier 86 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 87 Plus (E_Name 88 (E_Identifier 89 ((*FLOW_COUNT*) 28) )) (E_Literal 90 (Integer_Literal 1) ) ))
            S_Null (* arguments of procedure call are unrecognized ! *)
          ))
          S_Null (* arguments of procedure call are unrecognized ! *)
        )
      ) 
      (S_Sequence 95
      (S_If 96 (E_Binary_Operation 97 Or (E_Name 98 (E_Identifier 99 ((*CBF*) 23) )) (E_Binary_Operation 100 Equal (E_Name 101 (E_Identifier 102 ((*VI9*) 25) )) (E_Literal 103 (Integer_Literal 9) ) ) )
        (S_If 104 (E_Binary_Operation 105 Or (E_Binary_Operation 106 Greater_Than (E_Binary_Operation 107 Plus (E_Name 108 (E_Identifier 109 ((*VI1*) 24) )) (E_Name 110 (E_Identifier 111 ((*CI9*) 20) )) ) (E_Literal 112 (Integer_Literal 0) ) ) (E_Binary_Operation 113 And (E_Name 114 (E_Identifier 115 ((*CBF*) 23) )) (E_Name 116 (E_Identifier 117 ((*VBT*) 26) )) ) )
          (S_Assignment 118 (E_Identifier 119 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 120 Plus (E_Name 121 (E_Identifier 122 ((*FLOW_COUNT*) 28) )) (E_Literal 123 (Integer_Literal 1) ) ))
          S_Null
        )
        (S_If 124 (E_Binary_Operation 125 Or (E_Name 126 (E_Identifier 127 ((*VBF*) 27) )) (E_Binary_Operation 128 Greater_Than (E_Name 129 (E_Identifier 130 ((*VI1*) 24) )) (E_Literal 131 (Integer_Literal 10) ) ) )
          S_Null (* arguments of procedure call are unrecognized ! *)
          S_Null
        )
      ) 
      (S_Sequence 134
      (S_If 135 (E_Binary_Operation 136 And (E_Binary_Operation 137 And (E_Unary_Operation 138 Not (E_Name 139 (E_Identifier 140 ((*CBT*) 22) )) ) (E_Unary_Operation 141 Not (E_Name 142 (E_Identifier 143 ((*VBT*) 26) )) ) ) (E_Binary_Operation 144 Less_Than (E_Name 145 (E_Identifier 146 ((*CI9*) 20) )) (E_Literal 147 (Integer_Literal 0) ) ) )
        (S_Sequence 148
        (S_If 149 (E_Binary_Operation 150 Or (E_Literal 151 (Boolean_Literal false) ) (E_Unary_Operation 152 Not (E_Literal 153 (Boolean_Literal true) ) ) )
          S_Null (* arguments of procedure call are unrecognized ! *)
          (S_If 156 (E_Binary_Operation 157 Greater_Than_Or_Equal (E_Name 158 (E_Identifier 159 ((*VI1*) 24) )) (E_Literal 160 (Integer_Literal 0) ) )
            S_Null
            S_Null (* arguments of procedure call are unrecognized ! *)
          )
        ) 
        S_Null (* arguments of procedure call are unrecognized ! *))
        (S_If 165 (E_Binary_Operation 166 Or (E_Binary_Operation 167 Less_Than (E_Binary_Operation 168 Plus (E_Binary_Operation 169 Multiply (E_Name 170 (E_Identifier 171 ((*VI1*) 24) )) (E_Name 172 (E_Identifier 173 ((*CI9*) 20) )) ) (E_Literal 174 (Integer_Literal 3) ) ) (E_Literal 175 (Integer_Literal 0) ) ) (E_Binary_Operation 176 And (E_Name 177 (E_Identifier 178 ((*VBT*) 26) )) (E_Unary_Operation 179 Not (E_Binary_Operation 180 Less_Than (E_Name 181 (E_Identifier 182 ((*CI1*) 19) )) (E_Literal 183 (Integer_Literal 0) ) ) ) ) )
          (S_Sequence 184
          (S_Assignment 185 (E_Identifier 186 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 187 Plus (E_Name 188 (E_Identifier 189 ((*FLOW_COUNT*) 28) )) (E_Literal 190 (Integer_Literal 1) ) )) 
          (S_If 191 (E_Binary_Operation 192 Or (E_Unary_Operation 193 Not (E_Name 194 (E_Identifier 195 ((*CBT*) 22) )) ) (E_Binary_Operation 196 Equal (E_Binary_Operation 197 Plus (E_Name 198 (E_Identifier 199 ((*CI9*) 20) )) (E_Literal 200 (Integer_Literal 1) ) ) (E_Literal 201 (Integer_Literal 0) ) ) )
            S_Null (* arguments of procedure call are unrecognized ! *)
            (S_Sequence 204
            (S_Assignment 205 (E_Identifier 206 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 207 Plus (E_Name 208 (E_Identifier 209 ((*FLOW_COUNT*) 28) )) (E_Literal 210 (Integer_Literal 1) ) )) 
            (S_If 211 (E_Binary_Operation 212 Greater_Than (E_Binary_Operation 213 Multiply (E_Name 214 (E_Identifier 215 ((*VI1*) 24) )) (E_Literal 216 (Integer_Literal 2) ) ) (E_Literal 217 (Integer_Literal 0) ) )
              (S_Assignment 218 (E_Identifier 219 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 220 Plus (E_Name 221 (E_Identifier 222 ((*FLOW_COUNT*) 28) )) (E_Literal 223 (Integer_Literal 1) ) ))
              (S_If 224 (E_Literal 225 (Boolean_Literal true) )
                S_Null (* arguments of procedure call are unrecognized ! *)
                S_Null
              )
            ))
          ))
          (S_If 228 (E_Binary_Operation 229 And (E_Literal 230 (Boolean_Literal false) ) (E_Name 231 (E_Identifier 232 ((*CBF*) 23) )) )
            S_Null (* arguments of procedure call are unrecognized ! *)
            (S_If 235 (E_Name 236 (E_Identifier 237 ((*VBT*) 26) ))
              S_Null (* arguments of procedure call are unrecognized ! *)
              (S_If 240 (E_Binary_Operation 241 Equal (E_Name 242 (E_Identifier 243 ((*VI1*) 24) )) (E_Literal 244 (Integer_Literal 0) ) )
                S_Null (* arguments of procedure call are unrecognized ! *)
                S_Null (* arguments of procedure call are unrecognized ! *)
              )
            )
          )
        )
      ) 
      (S_Sequence 249
      (S_If 250 (E_Binary_Operation 251 Or (E_Binary_Operation 252 Equal (E_Literal 253 (Integer_Literal 3) ) (E_Literal 254 (Integer_Literal 5) ) ) (E_Unary_Operation 255 Not (E_Name 256 (E_Identifier 257 ((*VBT*) 26) )) ) )
        (S_Sequence 258
        S_Null (* arguments of procedure call are unrecognized ! *) 
        (S_If 261 (E_Binary_Operation 262 And (E_Literal 263 (Boolean_Literal true) ) (E_Name 264 (E_Identifier 265 ((*CBT*) 22) )) )
          S_Null (* arguments of procedure call are unrecognized ! *)
          S_Null (* arguments of procedure call are unrecognized ! *)
        ))
        (S_If 270 (E_Name 271 (E_Identifier 272 ((*CBF*) 23) ))
          (S_Sequence 273
          (S_If 274 (E_Binary_Operation 275 Or (E_Binary_Operation 276 Greater_Than_Or_Equal (E_Name 277 (E_Identifier 278 ((*VI9*) 25) )) (E_Literal 279 (Integer_Literal 0) ) ) (E_Literal 280 (Boolean_Literal false) ) )
            (S_Sequence 281
            (S_If 282 (E_Name 283 (E_Identifier 284 ((*VBT*) 26) ))
              S_Null (* arguments of procedure call are unrecognized ! *)
              S_Null
            ) 
            S_Null (* arguments of procedure call are unrecognized ! *))
            (S_If 289 (E_Binary_Operation 290 Not_Equal (E_Binary_Operation 291 Plus (E_Name 292 (E_Identifier 293 ((*VI1*) 24) )) (E_Name 294 (E_Identifier 295 ((*CI9*) 20) )) ) (E_Literal 296 (Integer_Literal 0) ) )
              S_Null (* arguments of procedure call are unrecognized ! *)
              S_Null
            )
          ) 
          S_Null (* arguments of procedure call are unrecognized ! *))
          (S_Sequence 301
          (S_If 302 (E_Binary_Operation 303 And (E_Name 304 (E_Identifier 305 ((*VBT*) 26) )) (E_Binary_Operation 306 Equal (E_Binary_Operation 307 Minus (E_Name 308 (E_Identifier 309 ((*CI9*) 20) )) (E_Literal 310 (Integer_Literal 9) ) ) (E_Literal 311 (Integer_Literal 0) ) ) )
            (S_Sequence 312
            (S_If 313 (E_Literal 314 (Boolean_Literal false) )
              S_Null (* arguments of procedure call are unrecognized ! *)
              (S_If 317 (E_Binary_Operation 318 And (E_Unary_Operation 319 Not (E_Name 320 (E_Identifier 321 ((*VBF*) 27) )) ) (E_Binary_Operation 322 Greater_Than (E_Name 323 (E_Identifier 324 ((*CI1*) 19) )) (E_Literal 325 (Integer_Literal 0) ) ) )
                (S_Assignment 326 (E_Identifier 327 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 328 Plus (E_Name 329 (E_Identifier 330 ((*FLOW_COUNT*) 28) )) (E_Literal 331 (Integer_Literal 1) ) ))
                S_Null (* arguments of procedure call are unrecognized ! *)
              )
            ) 
            (S_Assignment 334 (E_Identifier 335 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 336 Plus (E_Name 337 (E_Identifier 338 ((*FLOW_COUNT*) 28) )) (E_Literal 339 (Integer_Literal 1) ) )))
            (S_If 340 (E_Binary_Operation 341 Or (E_Unary_Operation 342 Not (E_Name 343 (E_Identifier 344 ((*CBF*) 23) )) ) (E_Binary_Operation 345 Not_Equal (E_Name 346 (E_Identifier 347 ((*VI1*) 24) )) (E_Literal 348 (Integer_Literal 0) ) ) )
              (S_Sequence 349
              (S_If 350 (E_Name 351 (E_Identifier 352 ((*VBT*) 26) ))
                S_Null
                S_Null
              ) 
              S_Null (* arguments of procedure call are unrecognized ! *))
              S_Null (* arguments of procedure call are unrecognized ! *)
            )
          ) 
          (S_Assignment 357 (E_Identifier 358 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 359 Plus (E_Name 360 (E_Identifier 361 ((*FLOW_COUNT*) 28) )) (E_Literal 362 (Integer_Literal 1) ) )))
        )
      ) 
      (S_Sequence 363
      (S_If 364 (E_Binary_Operation 365 Not_Equal (E_Name 366 (E_Identifier 367 ((*FLOW_COUNT*) 28) )) (E_Literal 368 (Integer_Literal 9) ) )
        S_Null (* arguments of procedure call are unrecognized ! *)
        S_Null
      ) 
      (S_Procedure_Call 371 372 ((*RESULT*) 7) 
        (nil)
      )))))))
  )
)).

Definition Symbol_Table := 
(mkSymbolTable
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*CI1*) 19), (In, Integer)) :: (((*VBT*) 26), (In_Out, Boolean)) :: (((*CBF*) 23), (In, Boolean)) :: (((*FLOW_COUNT*) 28), (In_Out, Integer)) :: (((*CBT*) 22), (In, Boolean)) :: (((*VI1*) 24), (In_Out, Integer)) :: (((*CI9*) 20), (In, Integer)) :: (((*VI9*) 25), (In_Out, Integer)) :: (((*VBF*) 27), (In_Out, Boolean)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*TIME_STAMP*) 16), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*LEGAL_FILE_NAME*) 15), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*FAILED*) 3), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*RESULT*) 7), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*SPECIAL_ACTION*) 5), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*TEST*) 2), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*NOT_APPLICABLE*) 4), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: (((*ACATS_C53007A*) 17), (0, (mkprocedure_body 20
  (* = = = Procedure Name = = = *)
  ((*ACATS_C53007A*) 17)
  (* = = = Formal Parameters = = = *)
  (nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration 21
D_Null_Declaration (* Undefined Declarations ! *) 
(D_Seq_Declaration 22
(D_Object_Declaration 24 (mkobject_declaration 25 ((*CI1*) 19) Integer (Some ((E_Literal 23 (Integer_Literal 1) ))))) 
(D_Seq_Declaration 26
(D_Object_Declaration 28 (mkobject_declaration 29 ((*CI9*) 20) Integer (Some ((E_Literal 27 (Integer_Literal 9) ))))) 
(D_Seq_Declaration 30
(D_Object_Declaration 32 (mkobject_declaration 33 ((*CBT*) 22) Boolean (Some ((E_Literal 31 (Boolean_Literal true) ))))) 
(D_Seq_Declaration 34
(D_Object_Declaration 36 (mkobject_declaration 37 ((*CBF*) 23) Boolean (Some ((E_Literal 35 (Boolean_Literal false) ))))) 
(D_Seq_Declaration 38
(D_Object_Declaration 40 (mkobject_declaration 41 ((*VI1*) 24) Integer (Some ((E_Literal 39 (Integer_Literal 1) ))))) 
(D_Seq_Declaration 42
(D_Object_Declaration 44 (mkobject_declaration 45 ((*VI9*) 25) Integer (Some ((E_Literal 43 (Integer_Literal 9) ))))) 
(D_Seq_Declaration 46
(D_Object_Declaration 48 (mkobject_declaration 49 ((*VBT*) 26) Boolean (Some ((E_Literal 47 (Boolean_Literal true) ))))) 
(D_Seq_Declaration 50
(D_Object_Declaration 52 (mkobject_declaration 53 ((*VBF*) 27) Boolean (Some ((E_Literal 51 (Boolean_Literal false) ))))) 
(D_Object_Declaration 55 (mkobject_declaration 56 ((*FLOW_COUNT*) 28) Integer (Some ((E_Literal 54 (Integer_Literal 0) )))))))))))))))
  (* = = = Procedure Body = = = *)
    (S_Sequence 57
    S_Null (* arguments of procedure call are unrecognized ! *) 
    (S_Sequence 60
    (S_If 61 (E_Name 62 (E_Identifier 63 ((*VBF*) 27) ))
      S_Null (* arguments of procedure call are unrecognized ! *)
      (S_If 66 (E_Binary_Operation 67 Less_Than (E_Name 68 (E_Identifier 69 ((*CI9*) 20) )) (E_Literal 70 (Integer_Literal 20) ) )
        (S_Sequence 71
        (S_Assignment 72 (E_Identifier 73 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 74 Plus (E_Name 75 (E_Identifier 76 ((*FLOW_COUNT*) 28) )) (E_Literal 77 (Integer_Literal 1) ) )) 
        (S_If 78 (E_Binary_Operation 79 And (E_Binary_Operation 80 Not_Equal (E_Name 81 (E_Identifier 82 ((*VI1*) 24) )) (E_Literal 83 (Integer_Literal 0) ) ) (E_Literal 84 (Boolean_Literal true) ) )
          (S_Assignment 85 (E_Identifier 86 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 87 Plus (E_Name 88 (E_Identifier 89 ((*FLOW_COUNT*) 28) )) (E_Literal 90 (Integer_Literal 1) ) ))
          S_Null (* arguments of procedure call are unrecognized ! *)
        ))
        S_Null (* arguments of procedure call are unrecognized ! *)
      )
    ) 
    (S_Sequence 95
    (S_If 96 (E_Binary_Operation 97 Or (E_Name 98 (E_Identifier 99 ((*CBF*) 23) )) (E_Binary_Operation 100 Equal (E_Name 101 (E_Identifier 102 ((*VI9*) 25) )) (E_Literal 103 (Integer_Literal 9) ) ) )
      (S_If 104 (E_Binary_Operation 105 Or (E_Binary_Operation 106 Greater_Than (E_Binary_Operation 107 Plus (E_Name 108 (E_Identifier 109 ((*VI1*) 24) )) (E_Name 110 (E_Identifier 111 ((*CI9*) 20) )) ) (E_Literal 112 (Integer_Literal 0) ) ) (E_Binary_Operation 113 And (E_Name 114 (E_Identifier 115 ((*CBF*) 23) )) (E_Name 116 (E_Identifier 117 ((*VBT*) 26) )) ) )
        (S_Assignment 118 (E_Identifier 119 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 120 Plus (E_Name 121 (E_Identifier 122 ((*FLOW_COUNT*) 28) )) (E_Literal 123 (Integer_Literal 1) ) ))
        S_Null
      )
      (S_If 124 (E_Binary_Operation 125 Or (E_Name 126 (E_Identifier 127 ((*VBF*) 27) )) (E_Binary_Operation 128 Greater_Than (E_Name 129 (E_Identifier 130 ((*VI1*) 24) )) (E_Literal 131 (Integer_Literal 10) ) ) )
        S_Null (* arguments of procedure call are unrecognized ! *)
        S_Null
      )
    ) 
    (S_Sequence 134
    (S_If 135 (E_Binary_Operation 136 And (E_Binary_Operation 137 And (E_Unary_Operation 138 Not (E_Name 139 (E_Identifier 140 ((*CBT*) 22) )) ) (E_Unary_Operation 141 Not (E_Name 142 (E_Identifier 143 ((*VBT*) 26) )) ) ) (E_Binary_Operation 144 Less_Than (E_Name 145 (E_Identifier 146 ((*CI9*) 20) )) (E_Literal 147 (Integer_Literal 0) ) ) )
      (S_Sequence 148
      (S_If 149 (E_Binary_Operation 150 Or (E_Literal 151 (Boolean_Literal false) ) (E_Unary_Operation 152 Not (E_Literal 153 (Boolean_Literal true) ) ) )
        S_Null (* arguments of procedure call are unrecognized ! *)
        (S_If 156 (E_Binary_Operation 157 Greater_Than_Or_Equal (E_Name 158 (E_Identifier 159 ((*VI1*) 24) )) (E_Literal 160 (Integer_Literal 0) ) )
          S_Null
          S_Null (* arguments of procedure call are unrecognized ! *)
        )
      ) 
      S_Null (* arguments of procedure call are unrecognized ! *))
      (S_If 165 (E_Binary_Operation 166 Or (E_Binary_Operation 167 Less_Than (E_Binary_Operation 168 Plus (E_Binary_Operation 169 Multiply (E_Name 170 (E_Identifier 171 ((*VI1*) 24) )) (E_Name 172 (E_Identifier 173 ((*CI9*) 20) )) ) (E_Literal 174 (Integer_Literal 3) ) ) (E_Literal 175 (Integer_Literal 0) ) ) (E_Binary_Operation 176 And (E_Name 177 (E_Identifier 178 ((*VBT*) 26) )) (E_Unary_Operation 179 Not (E_Binary_Operation 180 Less_Than (E_Name 181 (E_Identifier 182 ((*CI1*) 19) )) (E_Literal 183 (Integer_Literal 0) ) ) ) ) )
        (S_Sequence 184
        (S_Assignment 185 (E_Identifier 186 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 187 Plus (E_Name 188 (E_Identifier 189 ((*FLOW_COUNT*) 28) )) (E_Literal 190 (Integer_Literal 1) ) )) 
        (S_If 191 (E_Binary_Operation 192 Or (E_Unary_Operation 193 Not (E_Name 194 (E_Identifier 195 ((*CBT*) 22) )) ) (E_Binary_Operation 196 Equal (E_Binary_Operation 197 Plus (E_Name 198 (E_Identifier 199 ((*CI9*) 20) )) (E_Literal 200 (Integer_Literal 1) ) ) (E_Literal 201 (Integer_Literal 0) ) ) )
          S_Null (* arguments of procedure call are unrecognized ! *)
          (S_Sequence 204
          (S_Assignment 205 (E_Identifier 206 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 207 Plus (E_Name 208 (E_Identifier 209 ((*FLOW_COUNT*) 28) )) (E_Literal 210 (Integer_Literal 1) ) )) 
          (S_If 211 (E_Binary_Operation 212 Greater_Than (E_Binary_Operation 213 Multiply (E_Name 214 (E_Identifier 215 ((*VI1*) 24) )) (E_Literal 216 (Integer_Literal 2) ) ) (E_Literal 217 (Integer_Literal 0) ) )
            (S_Assignment 218 (E_Identifier 219 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 220 Plus (E_Name 221 (E_Identifier 222 ((*FLOW_COUNT*) 28) )) (E_Literal 223 (Integer_Literal 1) ) ))
            (S_If 224 (E_Literal 225 (Boolean_Literal true) )
              S_Null (* arguments of procedure call are unrecognized ! *)
              S_Null
            )
          ))
        ))
        (S_If 228 (E_Binary_Operation 229 And (E_Literal 230 (Boolean_Literal false) ) (E_Name 231 (E_Identifier 232 ((*CBF*) 23) )) )
          S_Null (* arguments of procedure call are unrecognized ! *)
          (S_If 235 (E_Name 236 (E_Identifier 237 ((*VBT*) 26) ))
            S_Null (* arguments of procedure call are unrecognized ! *)
            (S_If 240 (E_Binary_Operation 241 Equal (E_Name 242 (E_Identifier 243 ((*VI1*) 24) )) (E_Literal 244 (Integer_Literal 0) ) )
              S_Null (* arguments of procedure call are unrecognized ! *)
              S_Null (* arguments of procedure call are unrecognized ! *)
            )
          )
        )
      )
    ) 
    (S_Sequence 249
    (S_If 250 (E_Binary_Operation 251 Or (E_Binary_Operation 252 Equal (E_Literal 253 (Integer_Literal 3) ) (E_Literal 254 (Integer_Literal 5) ) ) (E_Unary_Operation 255 Not (E_Name 256 (E_Identifier 257 ((*VBT*) 26) )) ) )
      (S_Sequence 258
      S_Null (* arguments of procedure call are unrecognized ! *) 
      (S_If 261 (E_Binary_Operation 262 And (E_Literal 263 (Boolean_Literal true) ) (E_Name 264 (E_Identifier 265 ((*CBT*) 22) )) )
        S_Null (* arguments of procedure call are unrecognized ! *)
        S_Null (* arguments of procedure call are unrecognized ! *)
      ))
      (S_If 270 (E_Name 271 (E_Identifier 272 ((*CBF*) 23) ))
        (S_Sequence 273
        (S_If 274 (E_Binary_Operation 275 Or (E_Binary_Operation 276 Greater_Than_Or_Equal (E_Name 277 (E_Identifier 278 ((*VI9*) 25) )) (E_Literal 279 (Integer_Literal 0) ) ) (E_Literal 280 (Boolean_Literal false) ) )
          (S_Sequence 281
          (S_If 282 (E_Name 283 (E_Identifier 284 ((*VBT*) 26) ))
            S_Null (* arguments of procedure call are unrecognized ! *)
            S_Null
          ) 
          S_Null (* arguments of procedure call are unrecognized ! *))
          (S_If 289 (E_Binary_Operation 290 Not_Equal (E_Binary_Operation 291 Plus (E_Name 292 (E_Identifier 293 ((*VI1*) 24) )) (E_Name 294 (E_Identifier 295 ((*CI9*) 20) )) ) (E_Literal 296 (Integer_Literal 0) ) )
            S_Null (* arguments of procedure call are unrecognized ! *)
            S_Null
          )
        ) 
        S_Null (* arguments of procedure call are unrecognized ! *))
        (S_Sequence 301
        (S_If 302 (E_Binary_Operation 303 And (E_Name 304 (E_Identifier 305 ((*VBT*) 26) )) (E_Binary_Operation 306 Equal (E_Binary_Operation 307 Minus (E_Name 308 (E_Identifier 309 ((*CI9*) 20) )) (E_Literal 310 (Integer_Literal 9) ) ) (E_Literal 311 (Integer_Literal 0) ) ) )
          (S_Sequence 312
          (S_If 313 (E_Literal 314 (Boolean_Literal false) )
            S_Null (* arguments of procedure call are unrecognized ! *)
            (S_If 317 (E_Binary_Operation 318 And (E_Unary_Operation 319 Not (E_Name 320 (E_Identifier 321 ((*VBF*) 27) )) ) (E_Binary_Operation 322 Greater_Than (E_Name 323 (E_Identifier 324 ((*CI1*) 19) )) (E_Literal 325 (Integer_Literal 0) ) ) )
              (S_Assignment 326 (E_Identifier 327 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 328 Plus (E_Name 329 (E_Identifier 330 ((*FLOW_COUNT*) 28) )) (E_Literal 331 (Integer_Literal 1) ) ))
              S_Null (* arguments of procedure call are unrecognized ! *)
            )
          ) 
          (S_Assignment 334 (E_Identifier 335 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 336 Plus (E_Name 337 (E_Identifier 338 ((*FLOW_COUNT*) 28) )) (E_Literal 339 (Integer_Literal 1) ) )))
          (S_If 340 (E_Binary_Operation 341 Or (E_Unary_Operation 342 Not (E_Name 343 (E_Identifier 344 ((*CBF*) 23) )) ) (E_Binary_Operation 345 Not_Equal (E_Name 346 (E_Identifier 347 ((*VI1*) 24) )) (E_Literal 348 (Integer_Literal 0) ) ) )
            (S_Sequence 349
            (S_If 350 (E_Name 351 (E_Identifier 352 ((*VBT*) 26) ))
              S_Null
              S_Null
            ) 
            S_Null (* arguments of procedure call are unrecognized ! *))
            S_Null (* arguments of procedure call are unrecognized ! *)
          )
        ) 
        (S_Assignment 357 (E_Identifier 358 ((*FLOW_COUNT*) 28) ) (E_Binary_Operation 359 Plus (E_Name 360 (E_Identifier 361 ((*FLOW_COUNT*) 28) )) (E_Literal 362 (Integer_Literal 1) ) )))
      )
    ) 
    (S_Sequence 363
    (S_If 364 (E_Binary_Operation 365 Not_Equal (E_Name 366 (E_Identifier 367 ((*FLOW_COUNT*) 28) )) (E_Literal 368 (Integer_Literal 9) ) )
      S_Null (* arguments of procedure call are unrecognized ! *)
      S_Null
    ) 
    (S_Procedure_Call 371 372 ((*RESULT*) 7) 
      (nil)
    )))))))
))) :: (((*COMMENT*) 6), (0, (mkprocedure_body 0 0 nil D_Null_Declaration S_Null))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  ((((*FILE_NUM*) 1), (Subtype_Declaration 4 ((*FILE_NUM*) 1) Integer (Range 1 5))) :: nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((137, Boolean) :: (146, Integer) :: (101, Integer) :: (173, Integer) :: (200, Integer) :: (182, Integer) :: (209, Integer) :: (254, Integer) :: (83, Integer) :: (110, Integer) :: (119, Integer) :: (128, Boolean) :: (236, Boolean) :: (23, Integer) :: (131, Integer) :: (122, Integer) :: (194, Boolean) :: (176, Boolean) :: (77, Integer) :: (86, Integer) :: (158, Integer) :: (167, Boolean) :: (68, Integer) :: (140, Boolean) :: (113, Boolean) :: (346, Integer) :: (367, Integer) :: (62, Boolean) :: (35, Boolean) :: (358, Integer) :: (125, Boolean) :: (331, Integer) :: (304, Boolean) :: (80, Boolean) :: (89, Integer) :: (295, Integer) :: (116, Boolean) :: (98, Boolean) :: (107, Integer) :: (322, Boolean) :: (307, Integer) :: (74, Integer) :: (262, Boolean) :: (343, Boolean) :: (352, Boolean) :: (47, Boolean) :: (244, Integer) :: (253, Integer) :: (361, Integer) :: (325, Integer) :: (271, Boolean) :: (280, Boolean) :: (319, Boolean) :: (193, Boolean) :: (265, Boolean) :: (175, Integer) :: (256, Boolean) :: (337, Integer) :: (283, Boolean) :: (292, Integer) :: (166, Boolean) :: (328, Integer) :: (220, Integer) :: (229, Boolean) :: (310, Integer) :: (277, Integer) :: (142, Boolean) :: (151, Boolean) :: (223, Integer) :: (232, Boolean) :: (106, Boolean) :: (214, Integer) :: (160, Integer) :: (169, Integer) :: (178, Boolean) :: (115, Boolean) :: (187, Integer) :: (196, Boolean) :: (241, Boolean) :: (181, Integer) :: (172, Integer) :: (127, Boolean) :: (136, Boolean) :: (199, Integer) :: (208, Integer) :: (217, Integer) :: (100, Boolean) :: (82, Integer) :: (109, Integer) :: (190, Integer) :: (73, Integer) :: (145, Integer) :: (360, Integer) :: (67, Boolean) :: (139, Boolean) :: (130, Integer) :: (336, Integer) :: (345, Boolean) :: (121, Integer) :: (157, Boolean) :: (31, Boolean) :: (76, Integer) :: (103, Integer) :: (112, Integer) :: (309, Integer) :: (318, Boolean) :: (327, Integer) :: (97, Boolean) :: (348, Integer) :: (79, Boolean) :: (88, Integer) :: (294, Integer) :: (303, Boolean) :: (70, Integer) :: (43, Integer) :: (276, Boolean) :: (330, Integer) :: (366, Integer) :: (339, Integer) :: (321, Boolean) :: (189, Integer) :: (225, Boolean) :: (306, Boolean) :: (180, Boolean) :: (342, Boolean) :: (207, Integer) :: (216, Integer) :: (324, Integer) :: (198, Integer) :: (252, Boolean) :: (279, Integer) :: (351, Boolean) :: (243, Integer) :: (174, Integer) :: (147, Integer) :: (183, Integer) :: (255, Boolean) :: (264, Boolean) :: (129, Integer) :: (138, Boolean) :: (210, Integer) :: (219, Integer) :: (291, Integer) :: (120, Integer) :: (237, Boolean) :: (192, Boolean) :: (201, Integer) :: (186, Integer) :: (213, Integer) :: (222, Integer) :: (87, Integer) :: (168, Integer) :: (177, Boolean) :: (150, Boolean) :: (159, Integer) :: (141, Boolean) :: (105, Boolean) :: (114, Boolean) :: (123, Integer) :: (195, Boolean) :: (69, Integer) :: (231, Boolean) :: (90, Integer) :: (63, Boolean) :: (99, Boolean) :: (54, Integer) :: (341, Boolean) :: (171, Integer) :: (144, Boolean) :: (81, Integer) :: (153, Boolean) :: (126, Boolean) :: (359, Integer) :: (368, Integer) :: (27, Integer) :: (108, Integer) :: (117, Boolean) :: (323, Integer) :: (362, Integer) :: (263, Boolean) :: (344, Boolean) :: (272, Boolean) :: (84, Boolean) :: (102, Integer) :: (335, Integer) :: (308, Integer) :: (75, Integer) :: (290, Boolean) :: (39, Integer) :: (111, Integer) :: (230, Boolean) :: (51, Boolean) :: (257, Boolean) :: (347, Integer) :: (338, Integer) :: (221, Integer) :: (320, Boolean) :: (329, Integer) :: (212, Boolean) :: (275, Boolean) :: (284, Boolean) :: (311, Integer) :: (293, Integer) :: (365, Boolean) :: (314, Boolean) :: (179, Boolean) :: (152, Boolean) :: (188, Integer) :: (170, Integer) :: (143, Boolean) :: (215, Integer) :: (242, Integer) :: (251, Boolean) :: (197, Integer) :: (206, Integer) :: (296, Integer) :: (278, Integer) :: (305, Boolean) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((137, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)32)) :: (146, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)45)) :: (101, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)23)) :: (173, (sloc (*Line*)82 (*Col*)19 (*EndLine*)82 (*EndCol*)21)) :: (200, (sloc (*Line*)84 (*Col*)36 (*EndLine*)84 (*EndCol*)36)) :: (182, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)51)) :: (209, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)39)) :: (254, (sloc (*Line*)104 (*Col*)13 (*EndLine*)104 (*EndCol*)13)) :: (83, (sloc (*Line*)59 (*Col*)21 (*EndLine*)59 (*EndCol*)21)) :: (110, (sloc (*Line*)67 (*Col*)20 (*EndLine*)67 (*EndCol*)22)) :: (119, (sloc (*Line*)68 (*Col*)16 (*EndLine*)68 (*EndCol*)25)) :: (128, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)26)) :: (236, (sloc (*Line*)96 (*Col*)14 (*EndLine*)96 (*EndCol*)16)) :: (23, (sloc (*Line*)35 (*Col*)32 (*EndLine*)35 (*EndCol*)32)) :: (131, (sloc (*Line*)70 (*Col*)25 (*EndLine*)70 (*EndCol*)26)) :: (122, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)39)) :: (194, (sloc (*Line*)84 (*Col*)18 (*EndLine*)84 (*EndCol*)20)) :: (176, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)56)) :: (77, (sloc (*Line*)58 (*Col*)38 (*EndLine*)58 (*EndCol*)38)) :: (86, (sloc (*Line*)60 (*Col*)16 (*EndLine*)60 (*EndCol*)25)) :: (158, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)19)) :: (167, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)29)) :: (68, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)14)) :: (140, (sloc (*Line*)74 (*Col*)13 (*EndLine*)74 (*EndCol*)15)) :: (113, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)42)) :: (346, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)30)) :: (367, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)18)) :: (62, (sloc (*Line*)55 (*Col*)9 (*EndLine*)55 (*EndCol*)11)) :: (35, (sloc (*Line*)38 (*Col*)32 (*EndLine*)38 (*EndCol*)36)) :: (358, (sloc (*Line*)135 (*Col*)11 (*EndLine*)135 (*EndCol*)20)) :: (125, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)26)) :: (331, (sloc (*Line*)124 (*Col*)48 (*EndLine*)124 (*EndCol*)48)) :: (304, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)16)) :: (80, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)21)) :: (89, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)39)) :: (295, (sloc (*Line*)116 (*Col*)23 (*EndLine*)116 (*EndCol*)25)) :: (116, (sloc (*Line*)67 (*Col*)40 (*EndLine*)67 (*EndCol*)42)) :: (98, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)11)) :: (107, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)22)) :: (322, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)45)) :: (307, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)28)) :: (74, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)38)) :: (262, (sloc (*Line*)106 (*Col*)14 (*EndLine*)106 (*EndCol*)25)) :: (343, (sloc (*Line*)128 (*Col*)21 (*EndLine*)128 (*EndCol*)23)) :: (352, (sloc (*Line*)129 (*Col*)19 (*EndLine*)129 (*EndCol*)21)) :: (47, (sloc (*Line*)47 (*Col*)23 (*EndLine*)47 (*EndCol*)26)) :: (244, (sloc (*Line*)98 (*Col*)23 (*EndLine*)98 (*EndCol*)23)) :: (253, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)9)) :: (361, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)34)) :: (325, (sloc (*Line*)123 (*Col*)45 (*EndLine*)123 (*EndCol*)45)) :: (271, (sloc (*Line*)110 (*Col*)12 (*EndLine*)110 (*EndCol*)14)) :: (280, (sloc (*Line*)111 (*Col*)26 (*EndLine*)111 (*EndCol*)30)) :: (319, (sloc (*Line*)123 (*Col*)22 (*EndLine*)123 (*EndCol*)28)) :: (193, (sloc (*Line*)84 (*Col*)14 (*EndLine*)84 (*EndCol*)20)) :: (265, (sloc (*Line*)106 (*Col*)23 (*EndLine*)106 (*EndCol*)25)) :: (175, (sloc (*Line*)82 (*Col*)29 (*EndLine*)82 (*EndCol*)29)) :: (256, (sloc (*Line*)104 (*Col*)22 (*EndLine*)104 (*EndCol*)24)) :: (337, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)39)) :: (283, (sloc (*Line*)112 (*Col*)19 (*EndLine*)112 (*EndCol*)21)) :: (292, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)19)) :: (166, (sloc (*Line*)82 (*Col*)12 (*EndLine*)82 (*EndCol*)57)) :: (328, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)48)) :: (220, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)48)) :: (229, (sloc (*Line*)94 (*Col*)12 (*EndLine*)94 (*EndCol*)24)) :: (310, (sloc (*Line*)120 (*Col*)28 (*EndLine*)120 (*EndCol*)28)) :: (277, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)16)) :: (142, (sloc (*Line*)74 (*Col*)30 (*EndLine*)74 (*EndCol*)32)) :: (151, (sloc (*Line*)75 (*Col*)14 (*EndLine*)75 (*EndCol*)18)) :: (223, (sloc (*Line*)88 (*Col*)48 (*EndLine*)88 (*EndCol*)48)) :: (232, (sloc (*Line*)94 (*Col*)22 (*EndLine*)94 (*EndCol*)24)) :: (106, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)26)) :: (214, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)21)) :: (160, (sloc (*Line*)77 (*Col*)24 (*EndLine*)77 (*EndCol*)24)) :: (169, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)21)) :: (178, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)38)) :: (115, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)34)) :: (187, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)38)) :: (196, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)40)) :: (241, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)23)) :: (181, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)51)) :: (172, (sloc (*Line*)82 (*Col*)19 (*EndLine*)82 (*EndCol*)21)) :: (127, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)14)) :: (136, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)49)) :: (199, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)32)) :: (208, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)39)) :: (217, (sloc (*Line*)87 (*Col*)29 (*EndLine*)87 (*EndCol*)29)) :: (100, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)27)) :: (82, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)16)) :: (109, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)16)) :: (190, (sloc (*Line*)83 (*Col*)38 (*EndLine*)83 (*EndCol*)38)) :: (73, (sloc (*Line*)58 (*Col*)11 (*EndLine*)58 (*EndCol*)20)) :: (145, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)45)) :: (360, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)34)) :: (67, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)19)) :: (139, (sloc (*Line*)74 (*Col*)13 (*EndLine*)74 (*EndCol*)15)) :: (130, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)21)) :: (336, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)43)) :: (345, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)35)) :: (121, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)39)) :: (157, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)24)) :: (31, (sloc (*Line*)37 (*Col*)32 (*EndLine*)37 (*EndCol*)35)) :: (76, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)34)) :: (103, (sloc (*Line*)66 (*Col*)27 (*EndLine*)66 (*EndCol*)27)) :: (112, (sloc (*Line*)67 (*Col*)26 (*EndLine*)67 (*EndCol*)26)) :: (309, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)24)) :: (318, (sloc (*Line*)123 (*Col*)22 (*EndLine*)123 (*EndCol*)45)) :: (327, (sloc (*Line*)124 (*Col*)21 (*EndLine*)124 (*EndCol*)30)) :: (97, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)27)) :: (348, (sloc (*Line*)128 (*Col*)35 (*EndLine*)128 (*EndCol*)35)) :: (79, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)30)) :: (88, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)39)) :: (294, (sloc (*Line*)116 (*Col*)23 (*EndLine*)116 (*EndCol*)25)) :: (303, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)32)) :: (70, (sloc (*Line*)57 (*Col*)18 (*EndLine*)57 (*EndCol*)19)) :: (43, (sloc (*Line*)46 (*Col*)23 (*EndLine*)46 (*EndCol*)23)) :: (276, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)21)) :: (330, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)44)) :: (366, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)18)) :: (339, (sloc (*Line*)127 (*Col*)43 (*EndLine*)127 (*EndCol*)43)) :: (321, (sloc (*Line*)123 (*Col*)26 (*EndLine*)123 (*EndCol*)28)) :: (189, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)34)) :: (225, (sloc (*Line*)89 (*Col*)22 (*EndLine*)89 (*EndCol*)25)) :: (306, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)32)) :: (180, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)55)) :: (342, (sloc (*Line*)128 (*Col*)17 (*EndLine*)128 (*EndCol*)23)) :: (207, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)43)) :: (216, (sloc (*Line*)87 (*Col*)25 (*EndLine*)87 (*EndCol*)25)) :: (324, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)41)) :: (198, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)32)) :: (252, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)13)) :: (279, (sloc (*Line*)111 (*Col*)21 (*EndLine*)111 (*EndCol*)21)) :: (351, (sloc (*Line*)129 (*Col*)19 (*EndLine*)129 (*EndCol*)21)) :: (243, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)19)) :: (174, (sloc (*Line*)82 (*Col*)25 (*EndLine*)82 (*EndCol*)25)) :: (147, (sloc (*Line*)74 (*Col*)49 (*EndLine*)74 (*EndCol*)49)) :: (183, (sloc (*Line*)82 (*Col*)55 (*EndLine*)82 (*EndCol*)55)) :: (255, (sloc (*Line*)104 (*Col*)18 (*EndLine*)104 (*EndCol*)24)) :: (264, (sloc (*Line*)106 (*Col*)23 (*EndLine*)106 (*EndCol*)25)) :: (129, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)21)) :: (138, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)15)) :: (210, (sloc (*Line*)86 (*Col*)43 (*EndLine*)86 (*EndCol*)43)) :: (219, (sloc (*Line*)88 (*Col*)21 (*EndLine*)88 (*EndCol*)30)) :: (291, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)25)) :: (120, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)43)) :: (237, (sloc (*Line*)96 (*Col*)14 (*EndLine*)96 (*EndCol*)16)) :: (192, (sloc (*Line*)84 (*Col*)14 (*EndLine*)84 (*EndCol*)40)) :: (201, (sloc (*Line*)84 (*Col*)40 (*EndLine*)84 (*EndCol*)40)) :: (186, (sloc (*Line*)83 (*Col*)11 (*EndLine*)83 (*EndCol*)20)) :: (213, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)25)) :: (222, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)44)) :: (87, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)43)) :: (168, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)25)) :: (177, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)38)) :: (150, (sloc (*Line*)75 (*Col*)14 (*EndLine*)75 (*EndCol*)30)) :: (159, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)19)) :: (141, (sloc (*Line*)74 (*Col*)26 (*EndLine*)74 (*EndCol*)32)) :: (105, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)43)) :: (114, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)34)) :: (123, (sloc (*Line*)68 (*Col*)43 (*EndLine*)68 (*EndCol*)43)) :: (195, (sloc (*Line*)84 (*Col*)18 (*EndLine*)84 (*EndCol*)20)) :: (69, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)14)) :: (231, (sloc (*Line*)94 (*Col*)22 (*EndLine*)94 (*EndCol*)24)) :: (90, (sloc (*Line*)60 (*Col*)43 (*EndLine*)60 (*EndCol*)43)) :: (63, (sloc (*Line*)55 (*Col*)9 (*EndLine*)55 (*EndCol*)11)) :: (99, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)11)) :: (54, (sloc (*Line*)50 (*Col*)30 (*EndLine*)50 (*EndCol*)30)) :: (341, (sloc (*Line*)128 (*Col*)17 (*EndLine*)128 (*EndCol*)35)) :: (171, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)15)) :: (144, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)49)) :: (81, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)16)) :: (153, (sloc (*Line*)75 (*Col*)27 (*EndLine*)75 (*EndCol*)30)) :: (126, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)14)) :: (359, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)38)) :: (368, (sloc (*Line*)138 (*Col*)23 (*EndLine*)138 (*EndCol*)23)) :: (27, (sloc (*Line*)36 (*Col*)32 (*EndLine*)36 (*EndCol*)32)) :: (108, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)16)) :: (117, (sloc (*Line*)67 (*Col*)40 (*EndLine*)67 (*EndCol*)42)) :: (323, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)41)) :: (362, (sloc (*Line*)135 (*Col*)38 (*EndLine*)135 (*EndCol*)38)) :: (263, (sloc (*Line*)106 (*Col*)14 (*EndLine*)106 (*EndCol*)17)) :: (344, (sloc (*Line*)128 (*Col*)21 (*EndLine*)128 (*EndCol*)23)) :: (272, (sloc (*Line*)110 (*Col*)12 (*EndLine*)110 (*EndCol*)14)) :: (84, (sloc (*Line*)59 (*Col*)27 (*EndLine*)59 (*EndCol*)30)) :: (102, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)23)) :: (335, (sloc (*Line*)127 (*Col*)16 (*EndLine*)127 (*EndCol*)25)) :: (308, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)24)) :: (75, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)34)) :: (290, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)30)) :: (39, (sloc (*Line*)45 (*Col*)23 (*EndLine*)45 (*EndCol*)23)) :: (111, (sloc (*Line*)67 (*Col*)20 (*EndLine*)67 (*EndCol*)22)) :: (230, (sloc (*Line*)94 (*Col*)12 (*EndLine*)94 (*EndCol*)16)) :: (51, (sloc (*Line*)48 (*Col*)23 (*EndLine*)48 (*EndCol*)27)) :: (257, (sloc (*Line*)104 (*Col*)22 (*EndLine*)104 (*EndCol*)24)) :: (347, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)30)) :: (338, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)39)) :: (221, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)44)) :: (320, (sloc (*Line*)123 (*Col*)26 (*EndLine*)123 (*EndCol*)28)) :: (329, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)44)) :: (212, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)29)) :: (275, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)30)) :: (284, (sloc (*Line*)112 (*Col*)19 (*EndLine*)112 (*EndCol*)21)) :: (311, (sloc (*Line*)120 (*Col*)32 (*EndLine*)120 (*EndCol*)32)) :: (293, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)19)) :: (365, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)23)) :: (314, (sloc (*Line*)121 (*Col*)19 (*EndLine*)121 (*EndCol*)23)) :: (179, (sloc (*Line*)82 (*Col*)44 (*EndLine*)82 (*EndCol*)56)) :: (152, (sloc (*Line*)75 (*Col*)23 (*EndLine*)75 (*EndCol*)30)) :: (188, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)34)) :: (170, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)15)) :: (143, (sloc (*Line*)74 (*Col*)30 (*EndLine*)74 (*EndCol*)32)) :: (215, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)21)) :: (242, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)19)) :: (251, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)24)) :: (197, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)36)) :: (206, (sloc (*Line*)86 (*Col*)16 (*EndLine*)86 (*EndCol*)25)) :: (296, (sloc (*Line*)116 (*Col*)30 (*EndLine*)116 (*EndCol*)30)) :: (278, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)16)) :: (305, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)16)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((23, ("CBF", "ada://constant/ACATS_C53007A+31:11/CBF+38:6")) :: (26, ("VBT", "ada://variable/ACATS_C53007A+31:11/VBT+47:6")) :: (20, ("CI9", "ada://constant/ACATS_C53007A+31:11/CI9+36:6")) :: (22, ("CBT", "ada://constant/ACATS_C53007A+31:11/CBT+37:6")) :: (25, ("VI9", "ada://variable/ACATS_C53007A+31:11/VI9+46:6")) :: (28, ("FLOW_COUNT", "ada://variable/ACATS_C53007A+31:11/FLOW_COUNT+50:6")) :: (19, ("CI1", "ada://constant/ACATS_C53007A+31:11/CI1+35:6")) :: (27, ("VBF", "ada://variable/ACATS_C53007A+31:11/VBF+48:6")) :: (24, ("VI1", "ada://variable/ACATS_C53007A+31:11/VI1+45:6")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((17, ("ACATS_C53007A", "ada://procedure_body/ACATS_C53007A+31:11")) :: (8, ("IDENT_INT", "ada://expression_function/ACATS_REPORT-47:9/IDENT_INT-112:15")) :: (11, ("IDENT_BOOL", "ada://expression_function/ACATS_REPORT-47:9/IDENT_BOOL-129:15")) :: (2, ("TEST", "ada://procedure/ACATS_REPORT-47:9/TEST-53:16")) :: (5, ("SPECIAL_ACTION", "ada://procedure/ACATS_REPORT-47:9/SPECIAL_ACTION-85:16")) :: (14, ("EQUAL", "ada://expression_function/ACATS_REPORT-47:9/EQUAL-144:15")) :: (4, ("NOT_APPLICABLE", "ada://procedure/ACATS_REPORT-47:9/NOT_APPLICABLE-75:16")) :: (13, ("IDENT_WIDE_STR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_WIDE_STR-139:15")) :: (16, ("TIME_STAMP", "ada://function/ACATS_REPORT-47:9/TIME_STAMP-159:15")) :: (7, ("RESULT", "ada://procedure/ACATS_REPORT-47:9/RESULT-99:16")) :: (10, ("IDENT_WIDE_CHAR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_WIDE_CHAR-123:15")) :: (9, ("IDENT_CHAR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_CHAR-117:15")) :: (3, ("FAILED", "ada://procedure/ACATS_REPORT-47:9/FAILED-65:16")) :: (12, ("IDENT_STR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_STR-134:15")) :: (15, ("LEGAL_FILE_NAME", "ada://function/ACATS_REPORT-47:9/LEGAL_FILE_NAME-152:15")) :: (6, ("COMMENT", "ada://procedure/ACATS_REPORT-47:9/COMMENT-94:16")) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) package names map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) type names map = = = *)
  (*/////////////////////////////////////*)
  ((1, ("FILE_NUM", "ada://subtype/ACATS_REPORT-47:9/FILE_NUM-49:14")) :: nil)
))
).

Definition Coq_AST_Tree_X := 
(D_Seq_Declaration_X 1
(D_Seq_Declaration_X 2
(D_Type_Declaration_X 3 (Subtype_Declaration_X 4 ((*FILE_NUM*) 1) Integer (Range_X 1 5))) 
(D_Seq_Declaration_X 5
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 6
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 7
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 8
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 9
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 10
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 11
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 12
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 13
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 14
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 15
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 16
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 17
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 18
D_Null_Declaration_X (* Undefined Declarations ! *) 
D_Null_Declaration_X (* Undefined Declarations ! *)))))))))))))))) 
(D_Procedure_Body_X 19 
  (mkprocedure_body_x 20
    (* = = = Procedure Name = = = *)
    ((*ACATS_C53007A*) 17)
    (* = = = Formal Parameters = = = *)
    (nil)
    (* = = = Object Declarations = = = *)
    ((D_Seq_Declaration_X 21
  D_Null_Declaration_X (* Undefined Declarations ! *) 
  (D_Seq_Declaration_X 22
  (D_Object_Declaration_X 24 (mkobject_declaration_x 25 ((*CI1*) 19) Integer (Some ((E_Literal_X 23 (Integer_Literal 1) (nil) nil))))) 
  (D_Seq_Declaration_X 26
  (D_Object_Declaration_X 28 (mkobject_declaration_x 29 ((*CI9*) 20) Integer (Some ((E_Literal_X 27 (Integer_Literal 9) (nil) nil))))) 
  (D_Seq_Declaration_X 30
  (D_Object_Declaration_X 32 (mkobject_declaration_x 33 ((*CBT*) 22) Boolean (Some ((E_Literal_X 31 (Boolean_Literal true) (nil) nil))))) 
  (D_Seq_Declaration_X 34
  (D_Object_Declaration_X 36 (mkobject_declaration_x 37 ((*CBF*) 23) Boolean (Some ((E_Literal_X 35 (Boolean_Literal false) (nil) nil))))) 
  (D_Seq_Declaration_X 38
  (D_Object_Declaration_X 40 (mkobject_declaration_x 41 ((*VI1*) 24) Integer (Some ((E_Literal_X 39 (Integer_Literal 1) (nil) nil))))) 
  (D_Seq_Declaration_X 42
  (D_Object_Declaration_X 44 (mkobject_declaration_x 45 ((*VI9*) 25) Integer (Some ((E_Literal_X 43 (Integer_Literal 9) (nil) nil))))) 
  (D_Seq_Declaration_X 46
  (D_Object_Declaration_X 48 (mkobject_declaration_x 49 ((*VBT*) 26) Boolean (Some ((E_Literal_X 47 (Boolean_Literal true) (nil) nil))))) 
  (D_Seq_Declaration_X 50
  (D_Object_Declaration_X 52 (mkobject_declaration_x 53 ((*VBF*) 27) Boolean (Some ((E_Literal_X 51 (Boolean_Literal false) (nil) nil))))) 
  (D_Object_Declaration_X 55 (mkobject_declaration_x 56 ((*FLOW_COUNT*) 28) Integer (Some ((E_Literal_X 54 (Integer_Literal 0) (nil) nil)))))))))))))))
    (* = = = Procedure Body = = = *)
      (S_Sequence_X 57
      S_Null_X (* arguments of procedure call are unrecognized ! *) 
      (S_Sequence_X 60
      (S_If_X 61 (E_Name_X 62 (E_Identifier_X 63 ((*VBF*) 27) (nil)))
        S_Null_X (* arguments of procedure call are unrecognized ! *)
        (S_If_X 66 (E_Binary_Operation_X 67 Less_Than (E_Name_X 68 (E_Identifier_X 69 ((*CI9*) 20) (nil))) (E_Literal_X 70 (Integer_Literal 20) (nil) nil) (nil) nil)
          (S_Sequence_X 71
          (S_Assignment_X 72 (E_Identifier_X 73 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 74 Plus (E_Name_X 75 (E_Identifier_X 76 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 77 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
          (S_If_X 78 (E_Binary_Operation_X 79 And (E_Binary_Operation_X 80 Not_Equal (E_Name_X 81 (E_Identifier_X 82 ((*VI1*) 24) (nil))) (E_Literal_X 83 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Literal_X 84 (Boolean_Literal true) (nil) nil) (nil) nil)
            (S_Assignment_X 85 (E_Identifier_X 86 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 87 Plus (E_Name_X 88 (E_Identifier_X 89 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 90 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
            S_Null_X (* arguments of procedure call are unrecognized ! *)
          ))
          S_Null_X (* arguments of procedure call are unrecognized ! *)
        )
      ) 
      (S_Sequence_X 95
      (S_If_X 96 (E_Binary_Operation_X 97 Or (E_Name_X 98 (E_Identifier_X 99 ((*CBF*) 23) (nil))) (E_Binary_Operation_X 100 Equal (E_Name_X 101 (E_Identifier_X 102 ((*VI9*) 25) (nil))) (E_Literal_X 103 (Integer_Literal 9) (nil) nil) (nil) nil) (nil) nil)
        (S_If_X 104 (E_Binary_Operation_X 105 Or (E_Binary_Operation_X 106 Greater_Than (E_Binary_Operation_X 107 Plus (E_Name_X 108 (E_Identifier_X 109 ((*VI1*) 24) (nil))) (E_Name_X 110 (E_Identifier_X 111 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 112 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Binary_Operation_X 113 And (E_Name_X 114 (E_Identifier_X 115 ((*CBF*) 23) (nil))) (E_Name_X 116 (E_Identifier_X 117 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil)
          (S_Assignment_X 118 (E_Identifier_X 119 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 120 Plus (E_Name_X 121 (E_Identifier_X 122 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 123 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
          S_Null_X
        )
        (S_If_X 124 (E_Binary_Operation_X 125 Or (E_Name_X 126 (E_Identifier_X 127 ((*VBF*) 27) (nil))) (E_Binary_Operation_X 128 Greater_Than (E_Name_X 129 (E_Identifier_X 130 ((*VI1*) 24) (nil))) (E_Literal_X 131 (Integer_Literal 10) (nil) nil) (nil) nil) (nil) nil)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
          S_Null_X
        )
      ) 
      (S_Sequence_X 134
      (S_If_X 135 (E_Binary_Operation_X 136 And (E_Binary_Operation_X 137 And (E_Unary_Operation_X 138 Not (E_Name_X 139 (E_Identifier_X 140 ((*CBT*) 22) (nil))) (nil) nil) (E_Unary_Operation_X 141 Not (E_Name_X 142 (E_Identifier_X 143 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil) (E_Binary_Operation_X 144 Less_Than (E_Name_X 145 (E_Identifier_X 146 ((*CI9*) 20) (nil))) (E_Literal_X 147 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
        (S_Sequence_X 148
        (S_If_X 149 (E_Binary_Operation_X 150 Or (E_Literal_X 151 (Boolean_Literal false) (nil) nil) (E_Unary_Operation_X 152 Not (E_Literal_X 153 (Boolean_Literal true) (nil) nil) (nil) nil) (nil) nil)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
          (S_If_X 156 (E_Binary_Operation_X 157 Greater_Than_Or_Equal (E_Name_X 158 (E_Identifier_X 159 ((*VI1*) 24) (nil))) (E_Literal_X 160 (Integer_Literal 0) (nil) nil) (nil) nil)
            S_Null_X
            S_Null_X (* arguments of procedure call are unrecognized ! *)
          )
        ) 
        S_Null_X (* arguments of procedure call are unrecognized ! *))
        (S_If_X 165 (E_Binary_Operation_X 166 Or (E_Binary_Operation_X 167 Less_Than (E_Binary_Operation_X 168 Plus (E_Binary_Operation_X 169 Multiply (E_Name_X 170 (E_Identifier_X 171 ((*VI1*) 24) (nil))) (E_Name_X 172 (E_Identifier_X 173 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 174 (Integer_Literal 3) (nil) nil) (Do_Overflow_Check :: nil) nil) (E_Literal_X 175 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Binary_Operation_X 176 And (E_Name_X 177 (E_Identifier_X 178 ((*VBT*) 26) (nil))) (E_Unary_Operation_X 179 Not (E_Binary_Operation_X 180 Less_Than (E_Name_X 181 (E_Identifier_X 182 ((*CI1*) 19) (nil))) (E_Literal_X 183 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil) (nil) nil) (nil) nil)
          (S_Sequence_X 184
          (S_Assignment_X 185 (E_Identifier_X 186 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 187 Plus (E_Name_X 188 (E_Identifier_X 189 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 190 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
          (S_If_X 191 (E_Binary_Operation_X 192 Or (E_Unary_Operation_X 193 Not (E_Name_X 194 (E_Identifier_X 195 ((*CBT*) 22) (nil))) (nil) nil) (E_Binary_Operation_X 196 Equal (E_Binary_Operation_X 197 Plus (E_Name_X 198 (E_Identifier_X 199 ((*CI9*) 20) (nil))) (E_Literal_X 200 (Integer_Literal 1) (nil) nil) (nil) nil) (E_Literal_X 201 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            (S_Sequence_X 204
            (S_Assignment_X 205 (E_Identifier_X 206 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 207 Plus (E_Name_X 208 (E_Identifier_X 209 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 210 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
            (S_If_X 211 (E_Binary_Operation_X 212 Greater_Than (E_Binary_Operation_X 213 Multiply (E_Name_X 214 (E_Identifier_X 215 ((*VI1*) 24) (nil))) (E_Literal_X 216 (Integer_Literal 2) (nil) nil) (Do_Overflow_Check :: nil) nil) (E_Literal_X 217 (Integer_Literal 0) (nil) nil) (nil) nil)
              (S_Assignment_X 218 (E_Identifier_X 219 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 220 Plus (E_Name_X 221 (E_Identifier_X 222 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 223 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
              (S_If_X 224 (E_Literal_X 225 (Boolean_Literal true) (nil) nil)
                S_Null_X (* arguments of procedure call are unrecognized ! *)
                S_Null_X
              )
            ))
          ))
          (S_If_X 228 (E_Binary_Operation_X 229 And (E_Literal_X 230 (Boolean_Literal false) (nil) nil) (E_Name_X 231 (E_Identifier_X 232 ((*CBF*) 23) (nil))) (nil) nil)
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            (S_If_X 235 (E_Name_X 236 (E_Identifier_X 237 ((*VBT*) 26) (nil)))
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              (S_If_X 240 (E_Binary_Operation_X 241 Equal (E_Name_X 242 (E_Identifier_X 243 ((*VI1*) 24) (nil))) (E_Literal_X 244 (Integer_Literal 0) (nil) nil) (nil) nil)
                S_Null_X (* arguments of procedure call are unrecognized ! *)
                S_Null_X (* arguments of procedure call are unrecognized ! *)
              )
            )
          )
        )
      ) 
      (S_Sequence_X 249
      (S_If_X 250 (E_Binary_Operation_X 251 Or (E_Binary_Operation_X 252 Equal (E_Literal_X 253 (Integer_Literal 3) (nil) nil) (E_Literal_X 254 (Integer_Literal 5) (nil) nil) (nil) nil) (E_Unary_Operation_X 255 Not (E_Name_X 256 (E_Identifier_X 257 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil)
        (S_Sequence_X 258
        S_Null_X (* arguments of procedure call are unrecognized ! *) 
        (S_If_X 261 (E_Binary_Operation_X 262 And (E_Literal_X 263 (Boolean_Literal true) (nil) nil) (E_Name_X 264 (E_Identifier_X 265 ((*CBT*) 22) (nil))) (nil) nil)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
        ))
        (S_If_X 270 (E_Name_X 271 (E_Identifier_X 272 ((*CBF*) 23) (nil)))
          (S_Sequence_X 273
          (S_If_X 274 (E_Binary_Operation_X 275 Or (E_Binary_Operation_X 276 Greater_Than_Or_Equal (E_Name_X 277 (E_Identifier_X 278 ((*VI9*) 25) (nil))) (E_Literal_X 279 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Literal_X 280 (Boolean_Literal false) (nil) nil) (nil) nil)
            (S_Sequence_X 281
            (S_If_X 282 (E_Name_X 283 (E_Identifier_X 284 ((*VBT*) 26) (nil)))
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              S_Null_X
            ) 
            S_Null_X (* arguments of procedure call are unrecognized ! *))
            (S_If_X 289 (E_Binary_Operation_X 290 Not_Equal (E_Binary_Operation_X 291 Plus (E_Name_X 292 (E_Identifier_X 293 ((*VI1*) 24) (nil))) (E_Name_X 294 (E_Identifier_X 295 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 296 (Integer_Literal 0) (nil) nil) (nil) nil)
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              S_Null_X
            )
          ) 
          S_Null_X (* arguments of procedure call are unrecognized ! *))
          (S_Sequence_X 301
          (S_If_X 302 (E_Binary_Operation_X 303 And (E_Name_X 304 (E_Identifier_X 305 ((*VBT*) 26) (nil))) (E_Binary_Operation_X 306 Equal (E_Binary_Operation_X 307 Minus (E_Name_X 308 (E_Identifier_X 309 ((*CI9*) 20) (nil))) (E_Literal_X 310 (Integer_Literal 9) (nil) nil) (nil) nil) (E_Literal_X 311 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
            (S_Sequence_X 312
            (S_If_X 313 (E_Literal_X 314 (Boolean_Literal false) (nil) nil)
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              (S_If_X 317 (E_Binary_Operation_X 318 And (E_Unary_Operation_X 319 Not (E_Name_X 320 (E_Identifier_X 321 ((*VBF*) 27) (nil))) (nil) nil) (E_Binary_Operation_X 322 Greater_Than (E_Name_X 323 (E_Identifier_X 324 ((*CI1*) 19) (nil))) (E_Literal_X 325 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
                (S_Assignment_X 326 (E_Identifier_X 327 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 328 Plus (E_Name_X 329 (E_Identifier_X 330 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 331 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
                S_Null_X (* arguments of procedure call are unrecognized ! *)
              )
            ) 
            (S_Assignment_X 334 (E_Identifier_X 335 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 336 Plus (E_Name_X 337 (E_Identifier_X 338 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 339 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)))
            (S_If_X 340 (E_Binary_Operation_X 341 Or (E_Unary_Operation_X 342 Not (E_Name_X 343 (E_Identifier_X 344 ((*CBF*) 23) (nil))) (nil) nil) (E_Binary_Operation_X 345 Not_Equal (E_Name_X 346 (E_Identifier_X 347 ((*VI1*) 24) (nil))) (E_Literal_X 348 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
              (S_Sequence_X 349
              (S_If_X 350 (E_Name_X 351 (E_Identifier_X 352 ((*VBT*) 26) (nil)))
                S_Null_X
                S_Null_X
              ) 
              S_Null_X (* arguments of procedure call are unrecognized ! *))
              S_Null_X (* arguments of procedure call are unrecognized ! *)
            )
          ) 
          (S_Assignment_X 357 (E_Identifier_X 358 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 359 Plus (E_Name_X 360 (E_Identifier_X 361 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 362 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)))
        )
      ) 
      (S_Sequence_X 363
      (S_If_X 364 (E_Binary_Operation_X 365 Not_Equal (E_Name_X 366 (E_Identifier_X 367 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 368 (Integer_Literal 9) (nil) nil) (nil) nil)
        S_Null_X (* arguments of procedure call are unrecognized ! *)
        S_Null_X
      ) 
      (S_Procedure_Call_X 371 372 ((*RESULT*) 7) 
        (nil)
      )))))))
  )
)).

Definition Symbol_Table_X := 
(mkSymbolTable_x
  (*///////////////////////////////////*)
  (* = = = (1) variable type map = = = *)
  (*///////////////////////////////////*)
  ((((*CI1*) 19), (In, Integer)) :: (((*VBT*) 26), (In_Out, Boolean)) :: (((*CBF*) 23), (In, Boolean)) :: (((*FLOW_COUNT*) 28), (In_Out, Integer)) :: (((*CBT*) 22), (In, Boolean)) :: (((*VI1*) 24), (In_Out, Integer)) :: (((*CI9*) 20), (In, Integer)) :: (((*VI9*) 25), (In_Out, Integer)) :: (((*VBF*) 27), (In_Out, Boolean)) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram declaration map = = = *)
  (*////////////////////////////////////////////*)
  ((((*TIME_STAMP*) 16), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*LEGAL_FILE_NAME*) 15), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*FAILED*) 3), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*RESULT*) 7), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*SPECIAL_ACTION*) 5), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*TEST*) 2), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*NOT_APPLICABLE*) 4), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: (((*ACATS_C53007A*) 17), (0, (mkprocedure_body_x 20
  (* = = = Procedure Name = = = *)
  ((*ACATS_C53007A*) 17)
  (* = = = Formal Parameters = = = *)
  (nil)
  (* = = = Object Declarations = = = *)
  ((D_Seq_Declaration_X 21
D_Null_Declaration_X (* Undefined Declarations ! *) 
(D_Seq_Declaration_X 22
(D_Object_Declaration_X 24 (mkobject_declaration_x 25 ((*CI1*) 19) Integer (Some ((E_Literal_X 23 (Integer_Literal 1) (nil) nil))))) 
(D_Seq_Declaration_X 26
(D_Object_Declaration_X 28 (mkobject_declaration_x 29 ((*CI9*) 20) Integer (Some ((E_Literal_X 27 (Integer_Literal 9) (nil) nil))))) 
(D_Seq_Declaration_X 30
(D_Object_Declaration_X 32 (mkobject_declaration_x 33 ((*CBT*) 22) Boolean (Some ((E_Literal_X 31 (Boolean_Literal true) (nil) nil))))) 
(D_Seq_Declaration_X 34
(D_Object_Declaration_X 36 (mkobject_declaration_x 37 ((*CBF*) 23) Boolean (Some ((E_Literal_X 35 (Boolean_Literal false) (nil) nil))))) 
(D_Seq_Declaration_X 38
(D_Object_Declaration_X 40 (mkobject_declaration_x 41 ((*VI1*) 24) Integer (Some ((E_Literal_X 39 (Integer_Literal 1) (nil) nil))))) 
(D_Seq_Declaration_X 42
(D_Object_Declaration_X 44 (mkobject_declaration_x 45 ((*VI9*) 25) Integer (Some ((E_Literal_X 43 (Integer_Literal 9) (nil) nil))))) 
(D_Seq_Declaration_X 46
(D_Object_Declaration_X 48 (mkobject_declaration_x 49 ((*VBT*) 26) Boolean (Some ((E_Literal_X 47 (Boolean_Literal true) (nil) nil))))) 
(D_Seq_Declaration_X 50
(D_Object_Declaration_X 52 (mkobject_declaration_x 53 ((*VBF*) 27) Boolean (Some ((E_Literal_X 51 (Boolean_Literal false) (nil) nil))))) 
(D_Object_Declaration_X 55 (mkobject_declaration_x 56 ((*FLOW_COUNT*) 28) Integer (Some ((E_Literal_X 54 (Integer_Literal 0) (nil) nil)))))))))))))))
  (* = = = Procedure Body = = = *)
    (S_Sequence_X 57
    S_Null_X (* arguments of procedure call are unrecognized ! *) 
    (S_Sequence_X 60
    (S_If_X 61 (E_Name_X 62 (E_Identifier_X 63 ((*VBF*) 27) (nil)))
      S_Null_X (* arguments of procedure call are unrecognized ! *)
      (S_If_X 66 (E_Binary_Operation_X 67 Less_Than (E_Name_X 68 (E_Identifier_X 69 ((*CI9*) 20) (nil))) (E_Literal_X 70 (Integer_Literal 20) (nil) nil) (nil) nil)
        (S_Sequence_X 71
        (S_Assignment_X 72 (E_Identifier_X 73 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 74 Plus (E_Name_X 75 (E_Identifier_X 76 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 77 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
        (S_If_X 78 (E_Binary_Operation_X 79 And (E_Binary_Operation_X 80 Not_Equal (E_Name_X 81 (E_Identifier_X 82 ((*VI1*) 24) (nil))) (E_Literal_X 83 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Literal_X 84 (Boolean_Literal true) (nil) nil) (nil) nil)
          (S_Assignment_X 85 (E_Identifier_X 86 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 87 Plus (E_Name_X 88 (E_Identifier_X 89 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 90 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
          S_Null_X (* arguments of procedure call are unrecognized ! *)
        ))
        S_Null_X (* arguments of procedure call are unrecognized ! *)
      )
    ) 
    (S_Sequence_X 95
    (S_If_X 96 (E_Binary_Operation_X 97 Or (E_Name_X 98 (E_Identifier_X 99 ((*CBF*) 23) (nil))) (E_Binary_Operation_X 100 Equal (E_Name_X 101 (E_Identifier_X 102 ((*VI9*) 25) (nil))) (E_Literal_X 103 (Integer_Literal 9) (nil) nil) (nil) nil) (nil) nil)
      (S_If_X 104 (E_Binary_Operation_X 105 Or (E_Binary_Operation_X 106 Greater_Than (E_Binary_Operation_X 107 Plus (E_Name_X 108 (E_Identifier_X 109 ((*VI1*) 24) (nil))) (E_Name_X 110 (E_Identifier_X 111 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 112 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Binary_Operation_X 113 And (E_Name_X 114 (E_Identifier_X 115 ((*CBF*) 23) (nil))) (E_Name_X 116 (E_Identifier_X 117 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil)
        (S_Assignment_X 118 (E_Identifier_X 119 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 120 Plus (E_Name_X 121 (E_Identifier_X 122 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 123 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
        S_Null_X
      )
      (S_If_X 124 (E_Binary_Operation_X 125 Or (E_Name_X 126 (E_Identifier_X 127 ((*VBF*) 27) (nil))) (E_Binary_Operation_X 128 Greater_Than (E_Name_X 129 (E_Identifier_X 130 ((*VI1*) 24) (nil))) (E_Literal_X 131 (Integer_Literal 10) (nil) nil) (nil) nil) (nil) nil)
        S_Null_X (* arguments of procedure call are unrecognized ! *)
        S_Null_X
      )
    ) 
    (S_Sequence_X 134
    (S_If_X 135 (E_Binary_Operation_X 136 And (E_Binary_Operation_X 137 And (E_Unary_Operation_X 138 Not (E_Name_X 139 (E_Identifier_X 140 ((*CBT*) 22) (nil))) (nil) nil) (E_Unary_Operation_X 141 Not (E_Name_X 142 (E_Identifier_X 143 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil) (E_Binary_Operation_X 144 Less_Than (E_Name_X 145 (E_Identifier_X 146 ((*CI9*) 20) (nil))) (E_Literal_X 147 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
      (S_Sequence_X 148
      (S_If_X 149 (E_Binary_Operation_X 150 Or (E_Literal_X 151 (Boolean_Literal false) (nil) nil) (E_Unary_Operation_X 152 Not (E_Literal_X 153 (Boolean_Literal true) (nil) nil) (nil) nil) (nil) nil)
        S_Null_X (* arguments of procedure call are unrecognized ! *)
        (S_If_X 156 (E_Binary_Operation_X 157 Greater_Than_Or_Equal (E_Name_X 158 (E_Identifier_X 159 ((*VI1*) 24) (nil))) (E_Literal_X 160 (Integer_Literal 0) (nil) nil) (nil) nil)
          S_Null_X
          S_Null_X (* arguments of procedure call are unrecognized ! *)
        )
      ) 
      S_Null_X (* arguments of procedure call are unrecognized ! *))
      (S_If_X 165 (E_Binary_Operation_X 166 Or (E_Binary_Operation_X 167 Less_Than (E_Binary_Operation_X 168 Plus (E_Binary_Operation_X 169 Multiply (E_Name_X 170 (E_Identifier_X 171 ((*VI1*) 24) (nil))) (E_Name_X 172 (E_Identifier_X 173 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 174 (Integer_Literal 3) (nil) nil) (Do_Overflow_Check :: nil) nil) (E_Literal_X 175 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Binary_Operation_X 176 And (E_Name_X 177 (E_Identifier_X 178 ((*VBT*) 26) (nil))) (E_Unary_Operation_X 179 Not (E_Binary_Operation_X 180 Less_Than (E_Name_X 181 (E_Identifier_X 182 ((*CI1*) 19) (nil))) (E_Literal_X 183 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil) (nil) nil) (nil) nil)
        (S_Sequence_X 184
        (S_Assignment_X 185 (E_Identifier_X 186 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 187 Plus (E_Name_X 188 (E_Identifier_X 189 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 190 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
        (S_If_X 191 (E_Binary_Operation_X 192 Or (E_Unary_Operation_X 193 Not (E_Name_X 194 (E_Identifier_X 195 ((*CBT*) 22) (nil))) (nil) nil) (E_Binary_Operation_X 196 Equal (E_Binary_Operation_X 197 Plus (E_Name_X 198 (E_Identifier_X 199 ((*CI9*) 20) (nil))) (E_Literal_X 200 (Integer_Literal 1) (nil) nil) (nil) nil) (E_Literal_X 201 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
          (S_Sequence_X 204
          (S_Assignment_X 205 (E_Identifier_X 206 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 207 Plus (E_Name_X 208 (E_Identifier_X 209 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 210 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)) 
          (S_If_X 211 (E_Binary_Operation_X 212 Greater_Than (E_Binary_Operation_X 213 Multiply (E_Name_X 214 (E_Identifier_X 215 ((*VI1*) 24) (nil))) (E_Literal_X 216 (Integer_Literal 2) (nil) nil) (Do_Overflow_Check :: nil) nil) (E_Literal_X 217 (Integer_Literal 0) (nil) nil) (nil) nil)
            (S_Assignment_X 218 (E_Identifier_X 219 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 220 Plus (E_Name_X 221 (E_Identifier_X 222 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 223 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
            (S_If_X 224 (E_Literal_X 225 (Boolean_Literal true) (nil) nil)
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              S_Null_X
            )
          ))
        ))
        (S_If_X 228 (E_Binary_Operation_X 229 And (E_Literal_X 230 (Boolean_Literal false) (nil) nil) (E_Name_X 231 (E_Identifier_X 232 ((*CBF*) 23) (nil))) (nil) nil)
          S_Null_X (* arguments of procedure call are unrecognized ! *)
          (S_If_X 235 (E_Name_X 236 (E_Identifier_X 237 ((*VBT*) 26) (nil)))
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            (S_If_X 240 (E_Binary_Operation_X 241 Equal (E_Name_X 242 (E_Identifier_X 243 ((*VI1*) 24) (nil))) (E_Literal_X 244 (Integer_Literal 0) (nil) nil) (nil) nil)
              S_Null_X (* arguments of procedure call are unrecognized ! *)
              S_Null_X (* arguments of procedure call are unrecognized ! *)
            )
          )
        )
      )
    ) 
    (S_Sequence_X 249
    (S_If_X 250 (E_Binary_Operation_X 251 Or (E_Binary_Operation_X 252 Equal (E_Literal_X 253 (Integer_Literal 3) (nil) nil) (E_Literal_X 254 (Integer_Literal 5) (nil) nil) (nil) nil) (E_Unary_Operation_X 255 Not (E_Name_X 256 (E_Identifier_X 257 ((*VBT*) 26) (nil))) (nil) nil) (nil) nil)
      (S_Sequence_X 258
      S_Null_X (* arguments of procedure call are unrecognized ! *) 
      (S_If_X 261 (E_Binary_Operation_X 262 And (E_Literal_X 263 (Boolean_Literal true) (nil) nil) (E_Name_X 264 (E_Identifier_X 265 ((*CBT*) 22) (nil))) (nil) nil)
        S_Null_X (* arguments of procedure call are unrecognized ! *)
        S_Null_X (* arguments of procedure call are unrecognized ! *)
      ))
      (S_If_X 270 (E_Name_X 271 (E_Identifier_X 272 ((*CBF*) 23) (nil)))
        (S_Sequence_X 273
        (S_If_X 274 (E_Binary_Operation_X 275 Or (E_Binary_Operation_X 276 Greater_Than_Or_Equal (E_Name_X 277 (E_Identifier_X 278 ((*VI9*) 25) (nil))) (E_Literal_X 279 (Integer_Literal 0) (nil) nil) (nil) nil) (E_Literal_X 280 (Boolean_Literal false) (nil) nil) (nil) nil)
          (S_Sequence_X 281
          (S_If_X 282 (E_Name_X 283 (E_Identifier_X 284 ((*VBT*) 26) (nil)))
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            S_Null_X
          ) 
          S_Null_X (* arguments of procedure call are unrecognized ! *))
          (S_If_X 289 (E_Binary_Operation_X 290 Not_Equal (E_Binary_Operation_X 291 Plus (E_Name_X 292 (E_Identifier_X 293 ((*VI1*) 24) (nil))) (E_Name_X 294 (E_Identifier_X 295 ((*CI9*) 20) (nil))) (Do_Overflow_Check :: nil) nil) (E_Literal_X 296 (Integer_Literal 0) (nil) nil) (nil) nil)
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            S_Null_X
          )
        ) 
        S_Null_X (* arguments of procedure call are unrecognized ! *))
        (S_Sequence_X 301
        (S_If_X 302 (E_Binary_Operation_X 303 And (E_Name_X 304 (E_Identifier_X 305 ((*VBT*) 26) (nil))) (E_Binary_Operation_X 306 Equal (E_Binary_Operation_X 307 Minus (E_Name_X 308 (E_Identifier_X 309 ((*CI9*) 20) (nil))) (E_Literal_X 310 (Integer_Literal 9) (nil) nil) (nil) nil) (E_Literal_X 311 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
          (S_Sequence_X 312
          (S_If_X 313 (E_Literal_X 314 (Boolean_Literal false) (nil) nil)
            S_Null_X (* arguments of procedure call are unrecognized ! *)
            (S_If_X 317 (E_Binary_Operation_X 318 And (E_Unary_Operation_X 319 Not (E_Name_X 320 (E_Identifier_X 321 ((*VBF*) 27) (nil))) (nil) nil) (E_Binary_Operation_X 322 Greater_Than (E_Name_X 323 (E_Identifier_X 324 ((*CI1*) 19) (nil))) (E_Literal_X 325 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
              (S_Assignment_X 326 (E_Identifier_X 327 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 328 Plus (E_Name_X 329 (E_Identifier_X 330 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 331 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil))
              S_Null_X (* arguments of procedure call are unrecognized ! *)
            )
          ) 
          (S_Assignment_X 334 (E_Identifier_X 335 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 336 Plus (E_Name_X 337 (E_Identifier_X 338 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 339 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)))
          (S_If_X 340 (E_Binary_Operation_X 341 Or (E_Unary_Operation_X 342 Not (E_Name_X 343 (E_Identifier_X 344 ((*CBF*) 23) (nil))) (nil) nil) (E_Binary_Operation_X 345 Not_Equal (E_Name_X 346 (E_Identifier_X 347 ((*VI1*) 24) (nil))) (E_Literal_X 348 (Integer_Literal 0) (nil) nil) (nil) nil) (nil) nil)
            (S_Sequence_X 349
            (S_If_X 350 (E_Name_X 351 (E_Identifier_X 352 ((*VBT*) 26) (nil)))
              S_Null_X
              S_Null_X
            ) 
            S_Null_X (* arguments of procedure call are unrecognized ! *))
            S_Null_X (* arguments of procedure call are unrecognized ! *)
          )
        ) 
        (S_Assignment_X 357 (E_Identifier_X 358 ((*FLOW_COUNT*) 28) (nil)) (E_Binary_Operation_X 359 Plus (E_Name_X 360 (E_Identifier_X 361 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 362 (Integer_Literal 1) (nil) nil) (Do_Overflow_Check :: nil) nil)))
      )
    ) 
    (S_Sequence_X 363
    (S_If_X 364 (E_Binary_Operation_X 365 Not_Equal (E_Name_X 366 (E_Identifier_X 367 ((*FLOW_COUNT*) 28) (nil))) (E_Literal_X 368 (Integer_Literal 9) (nil) nil) (nil) nil)
      S_Null_X (* arguments of procedure call are unrecognized ! *)
      S_Null_X
    ) 
    (S_Procedure_Call_X 371 372 ((*RESULT*) 7) 
      (nil)
    )))))))
))) :: (((*COMMENT*) 6), (0, (mkprocedure_body_x 0 0 nil D_Null_Declaration_X S_Null_X))) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) type declaration map = = = *)
  (*//////////////////////////////////////*)
  ((((*FILE_NUM*) 1), (Subtype_Declaration_X 4 ((*FILE_NUM*) 1) Integer (Range_X 1 5))) :: nil)
  (*/////////////////////////////////////*)
  (* = = = (4) expression type map = = = *)
  (*/////////////////////////////////////*)
  ((137, Boolean) :: (146, Integer) :: (101, Integer) :: (173, Integer) :: (200, Integer) :: (182, Integer) :: (209, Integer) :: (254, Integer) :: (83, Integer) :: (110, Integer) :: (119, Integer) :: (128, Boolean) :: (236, Boolean) :: (23, Integer) :: (131, Integer) :: (122, Integer) :: (194, Boolean) :: (176, Boolean) :: (77, Integer) :: (86, Integer) :: (158, Integer) :: (167, Boolean) :: (68, Integer) :: (140, Boolean) :: (113, Boolean) :: (346, Integer) :: (367, Integer) :: (62, Boolean) :: (35, Boolean) :: (358, Integer) :: (125, Boolean) :: (331, Integer) :: (304, Boolean) :: (80, Boolean) :: (89, Integer) :: (295, Integer) :: (116, Boolean) :: (98, Boolean) :: (107, Integer) :: (322, Boolean) :: (307, Integer) :: (74, Integer) :: (262, Boolean) :: (343, Boolean) :: (352, Boolean) :: (47, Boolean) :: (244, Integer) :: (253, Integer) :: (361, Integer) :: (325, Integer) :: (271, Boolean) :: (280, Boolean) :: (319, Boolean) :: (193, Boolean) :: (265, Boolean) :: (175, Integer) :: (256, Boolean) :: (337, Integer) :: (283, Boolean) :: (292, Integer) :: (166, Boolean) :: (328, Integer) :: (220, Integer) :: (229, Boolean) :: (310, Integer) :: (277, Integer) :: (142, Boolean) :: (151, Boolean) :: (223, Integer) :: (232, Boolean) :: (106, Boolean) :: (214, Integer) :: (160, Integer) :: (169, Integer) :: (178, Boolean) :: (115, Boolean) :: (187, Integer) :: (196, Boolean) :: (241, Boolean) :: (181, Integer) :: (172, Integer) :: (127, Boolean) :: (136, Boolean) :: (199, Integer) :: (208, Integer) :: (217, Integer) :: (100, Boolean) :: (82, Integer) :: (109, Integer) :: (190, Integer) :: (73, Integer) :: (145, Integer) :: (360, Integer) :: (67, Boolean) :: (139, Boolean) :: (130, Integer) :: (336, Integer) :: (345, Boolean) :: (121, Integer) :: (157, Boolean) :: (31, Boolean) :: (76, Integer) :: (103, Integer) :: (112, Integer) :: (309, Integer) :: (318, Boolean) :: (327, Integer) :: (97, Boolean) :: (348, Integer) :: (79, Boolean) :: (88, Integer) :: (294, Integer) :: (303, Boolean) :: (70, Integer) :: (43, Integer) :: (276, Boolean) :: (330, Integer) :: (366, Integer) :: (339, Integer) :: (321, Boolean) :: (189, Integer) :: (225, Boolean) :: (306, Boolean) :: (180, Boolean) :: (342, Boolean) :: (207, Integer) :: (216, Integer) :: (324, Integer) :: (198, Integer) :: (252, Boolean) :: (279, Integer) :: (351, Boolean) :: (243, Integer) :: (174, Integer) :: (147, Integer) :: (183, Integer) :: (255, Boolean) :: (264, Boolean) :: (129, Integer) :: (138, Boolean) :: (210, Integer) :: (219, Integer) :: (291, Integer) :: (120, Integer) :: (237, Boolean) :: (192, Boolean) :: (201, Integer) :: (186, Integer) :: (213, Integer) :: (222, Integer) :: (87, Integer) :: (168, Integer) :: (177, Boolean) :: (150, Boolean) :: (159, Integer) :: (141, Boolean) :: (105, Boolean) :: (114, Boolean) :: (123, Integer) :: (195, Boolean) :: (69, Integer) :: (231, Boolean) :: (90, Integer) :: (63, Boolean) :: (99, Boolean) :: (54, Integer) :: (341, Boolean) :: (171, Integer) :: (144, Boolean) :: (81, Integer) :: (153, Boolean) :: (126, Boolean) :: (359, Integer) :: (368, Integer) :: (27, Integer) :: (108, Integer) :: (117, Boolean) :: (323, Integer) :: (362, Integer) :: (263, Boolean) :: (344, Boolean) :: (272, Boolean) :: (84, Boolean) :: (102, Integer) :: (335, Integer) :: (308, Integer) :: (75, Integer) :: (290, Boolean) :: (39, Integer) :: (111, Integer) :: (230, Boolean) :: (51, Boolean) :: (257, Boolean) :: (347, Integer) :: (338, Integer) :: (221, Integer) :: (320, Boolean) :: (329, Integer) :: (212, Boolean) :: (275, Boolean) :: (284, Boolean) :: (311, Integer) :: (293, Integer) :: (365, Boolean) :: (314, Boolean) :: (179, Boolean) :: (152, Boolean) :: (188, Integer) :: (170, Integer) :: (143, Boolean) :: (215, Integer) :: (242, Integer) :: (251, Boolean) :: (197, Integer) :: (206, Integer) :: (296, Integer) :: (278, Integer) :: (305, Boolean) :: nil)
  (*/////////////////////////////////////////////////*)
  (* = = = (5) ast node to source location map = = = *)
  (*/////////////////////////////////////////////////*)
  ((137, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)32)) :: (146, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)45)) :: (101, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)23)) :: (173, (sloc (*Line*)82 (*Col*)19 (*EndLine*)82 (*EndCol*)21)) :: (200, (sloc (*Line*)84 (*Col*)36 (*EndLine*)84 (*EndCol*)36)) :: (182, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)51)) :: (209, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)39)) :: (254, (sloc (*Line*)104 (*Col*)13 (*EndLine*)104 (*EndCol*)13)) :: (83, (sloc (*Line*)59 (*Col*)21 (*EndLine*)59 (*EndCol*)21)) :: (110, (sloc (*Line*)67 (*Col*)20 (*EndLine*)67 (*EndCol*)22)) :: (119, (sloc (*Line*)68 (*Col*)16 (*EndLine*)68 (*EndCol*)25)) :: (128, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)26)) :: (236, (sloc (*Line*)96 (*Col*)14 (*EndLine*)96 (*EndCol*)16)) :: (23, (sloc (*Line*)35 (*Col*)32 (*EndLine*)35 (*EndCol*)32)) :: (131, (sloc (*Line*)70 (*Col*)25 (*EndLine*)70 (*EndCol*)26)) :: (122, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)39)) :: (194, (sloc (*Line*)84 (*Col*)18 (*EndLine*)84 (*EndCol*)20)) :: (176, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)56)) :: (77, (sloc (*Line*)58 (*Col*)38 (*EndLine*)58 (*EndCol*)38)) :: (86, (sloc (*Line*)60 (*Col*)16 (*EndLine*)60 (*EndCol*)25)) :: (158, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)19)) :: (167, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)29)) :: (68, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)14)) :: (140, (sloc (*Line*)74 (*Col*)13 (*EndLine*)74 (*EndCol*)15)) :: (113, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)42)) :: (346, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)30)) :: (367, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)18)) :: (62, (sloc (*Line*)55 (*Col*)9 (*EndLine*)55 (*EndCol*)11)) :: (35, (sloc (*Line*)38 (*Col*)32 (*EndLine*)38 (*EndCol*)36)) :: (358, (sloc (*Line*)135 (*Col*)11 (*EndLine*)135 (*EndCol*)20)) :: (125, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)26)) :: (331, (sloc (*Line*)124 (*Col*)48 (*EndLine*)124 (*EndCol*)48)) :: (304, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)16)) :: (80, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)21)) :: (89, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)39)) :: (295, (sloc (*Line*)116 (*Col*)23 (*EndLine*)116 (*EndCol*)25)) :: (116, (sloc (*Line*)67 (*Col*)40 (*EndLine*)67 (*EndCol*)42)) :: (98, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)11)) :: (107, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)22)) :: (322, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)45)) :: (307, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)28)) :: (74, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)38)) :: (262, (sloc (*Line*)106 (*Col*)14 (*EndLine*)106 (*EndCol*)25)) :: (343, (sloc (*Line*)128 (*Col*)21 (*EndLine*)128 (*EndCol*)23)) :: (352, (sloc (*Line*)129 (*Col*)19 (*EndLine*)129 (*EndCol*)21)) :: (47, (sloc (*Line*)47 (*Col*)23 (*EndLine*)47 (*EndCol*)26)) :: (244, (sloc (*Line*)98 (*Col*)23 (*EndLine*)98 (*EndCol*)23)) :: (253, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)9)) :: (361, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)34)) :: (325, (sloc (*Line*)123 (*Col*)45 (*EndLine*)123 (*EndCol*)45)) :: (271, (sloc (*Line*)110 (*Col*)12 (*EndLine*)110 (*EndCol*)14)) :: (280, (sloc (*Line*)111 (*Col*)26 (*EndLine*)111 (*EndCol*)30)) :: (319, (sloc (*Line*)123 (*Col*)22 (*EndLine*)123 (*EndCol*)28)) :: (193, (sloc (*Line*)84 (*Col*)14 (*EndLine*)84 (*EndCol*)20)) :: (265, (sloc (*Line*)106 (*Col*)23 (*EndLine*)106 (*EndCol*)25)) :: (175, (sloc (*Line*)82 (*Col*)29 (*EndLine*)82 (*EndCol*)29)) :: (256, (sloc (*Line*)104 (*Col*)22 (*EndLine*)104 (*EndCol*)24)) :: (337, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)39)) :: (283, (sloc (*Line*)112 (*Col*)19 (*EndLine*)112 (*EndCol*)21)) :: (292, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)19)) :: (166, (sloc (*Line*)82 (*Col*)12 (*EndLine*)82 (*EndCol*)57)) :: (328, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)48)) :: (220, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)48)) :: (229, (sloc (*Line*)94 (*Col*)12 (*EndLine*)94 (*EndCol*)24)) :: (310, (sloc (*Line*)120 (*Col*)28 (*EndLine*)120 (*EndCol*)28)) :: (277, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)16)) :: (142, (sloc (*Line*)74 (*Col*)30 (*EndLine*)74 (*EndCol*)32)) :: (151, (sloc (*Line*)75 (*Col*)14 (*EndLine*)75 (*EndCol*)18)) :: (223, (sloc (*Line*)88 (*Col*)48 (*EndLine*)88 (*EndCol*)48)) :: (232, (sloc (*Line*)94 (*Col*)22 (*EndLine*)94 (*EndCol*)24)) :: (106, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)26)) :: (214, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)21)) :: (160, (sloc (*Line*)77 (*Col*)24 (*EndLine*)77 (*EndCol*)24)) :: (169, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)21)) :: (178, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)38)) :: (115, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)34)) :: (187, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)38)) :: (196, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)40)) :: (241, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)23)) :: (181, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)51)) :: (172, (sloc (*Line*)82 (*Col*)19 (*EndLine*)82 (*EndCol*)21)) :: (127, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)14)) :: (136, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)49)) :: (199, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)32)) :: (208, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)39)) :: (217, (sloc (*Line*)87 (*Col*)29 (*EndLine*)87 (*EndCol*)29)) :: (100, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)27)) :: (82, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)16)) :: (109, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)16)) :: (190, (sloc (*Line*)83 (*Col*)38 (*EndLine*)83 (*EndCol*)38)) :: (73, (sloc (*Line*)58 (*Col*)11 (*EndLine*)58 (*EndCol*)20)) :: (145, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)45)) :: (360, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)34)) :: (67, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)19)) :: (139, (sloc (*Line*)74 (*Col*)13 (*EndLine*)74 (*EndCol*)15)) :: (130, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)21)) :: (336, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)43)) :: (345, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)35)) :: (121, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)39)) :: (157, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)24)) :: (31, (sloc (*Line*)37 (*Col*)32 (*EndLine*)37 (*EndCol*)35)) :: (76, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)34)) :: (103, (sloc (*Line*)66 (*Col*)27 (*EndLine*)66 (*EndCol*)27)) :: (112, (sloc (*Line*)67 (*Col*)26 (*EndLine*)67 (*EndCol*)26)) :: (309, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)24)) :: (318, (sloc (*Line*)123 (*Col*)22 (*EndLine*)123 (*EndCol*)45)) :: (327, (sloc (*Line*)124 (*Col*)21 (*EndLine*)124 (*EndCol*)30)) :: (97, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)27)) :: (348, (sloc (*Line*)128 (*Col*)35 (*EndLine*)128 (*EndCol*)35)) :: (79, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)30)) :: (88, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)39)) :: (294, (sloc (*Line*)116 (*Col*)23 (*EndLine*)116 (*EndCol*)25)) :: (303, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)32)) :: (70, (sloc (*Line*)57 (*Col*)18 (*EndLine*)57 (*EndCol*)19)) :: (43, (sloc (*Line*)46 (*Col*)23 (*EndLine*)46 (*EndCol*)23)) :: (276, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)21)) :: (330, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)44)) :: (366, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)18)) :: (339, (sloc (*Line*)127 (*Col*)43 (*EndLine*)127 (*EndCol*)43)) :: (321, (sloc (*Line*)123 (*Col*)26 (*EndLine*)123 (*EndCol*)28)) :: (189, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)34)) :: (225, (sloc (*Line*)89 (*Col*)22 (*EndLine*)89 (*EndCol*)25)) :: (306, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)32)) :: (180, (sloc (*Line*)82 (*Col*)49 (*EndLine*)82 (*EndCol*)55)) :: (342, (sloc (*Line*)128 (*Col*)17 (*EndLine*)128 (*EndCol*)23)) :: (207, (sloc (*Line*)86 (*Col*)30 (*EndLine*)86 (*EndCol*)43)) :: (216, (sloc (*Line*)87 (*Col*)25 (*EndLine*)87 (*EndCol*)25)) :: (324, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)41)) :: (198, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)32)) :: (252, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)13)) :: (279, (sloc (*Line*)111 (*Col*)21 (*EndLine*)111 (*EndCol*)21)) :: (351, (sloc (*Line*)129 (*Col*)19 (*EndLine*)129 (*EndCol*)21)) :: (243, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)19)) :: (174, (sloc (*Line*)82 (*Col*)25 (*EndLine*)82 (*EndCol*)25)) :: (147, (sloc (*Line*)74 (*Col*)49 (*EndLine*)74 (*EndCol*)49)) :: (183, (sloc (*Line*)82 (*Col*)55 (*EndLine*)82 (*EndCol*)55)) :: (255, (sloc (*Line*)104 (*Col*)18 (*EndLine*)104 (*EndCol*)24)) :: (264, (sloc (*Line*)106 (*Col*)23 (*EndLine*)106 (*EndCol*)25)) :: (129, (sloc (*Line*)70 (*Col*)19 (*EndLine*)70 (*EndCol*)21)) :: (138, (sloc (*Line*)74 (*Col*)9 (*EndLine*)74 (*EndCol*)15)) :: (210, (sloc (*Line*)86 (*Col*)43 (*EndLine*)86 (*EndCol*)43)) :: (219, (sloc (*Line*)88 (*Col*)21 (*EndLine*)88 (*EndCol*)30)) :: (291, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)25)) :: (120, (sloc (*Line*)68 (*Col*)30 (*EndLine*)68 (*EndCol*)43)) :: (237, (sloc (*Line*)96 (*Col*)14 (*EndLine*)96 (*EndCol*)16)) :: (192, (sloc (*Line*)84 (*Col*)14 (*EndLine*)84 (*EndCol*)40)) :: (201, (sloc (*Line*)84 (*Col*)40 (*EndLine*)84 (*EndCol*)40)) :: (186, (sloc (*Line*)83 (*Col*)11 (*EndLine*)83 (*EndCol*)20)) :: (213, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)25)) :: (222, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)44)) :: (87, (sloc (*Line*)60 (*Col*)30 (*EndLine*)60 (*EndCol*)43)) :: (168, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)25)) :: (177, (sloc (*Line*)82 (*Col*)36 (*EndLine*)82 (*EndCol*)38)) :: (150, (sloc (*Line*)75 (*Col*)14 (*EndLine*)75 (*EndCol*)30)) :: (159, (sloc (*Line*)77 (*Col*)17 (*EndLine*)77 (*EndCol*)19)) :: (141, (sloc (*Line*)74 (*Col*)26 (*EndLine*)74 (*EndCol*)32)) :: (105, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)43)) :: (114, (sloc (*Line*)67 (*Col*)32 (*EndLine*)67 (*EndCol*)34)) :: (123, (sloc (*Line*)68 (*Col*)43 (*EndLine*)68 (*EndCol*)43)) :: (195, (sloc (*Line*)84 (*Col*)18 (*EndLine*)84 (*EndCol*)20)) :: (69, (sloc (*Line*)57 (*Col*)12 (*EndLine*)57 (*EndCol*)14)) :: (231, (sloc (*Line*)94 (*Col*)22 (*EndLine*)94 (*EndCol*)24)) :: (90, (sloc (*Line*)60 (*Col*)43 (*EndLine*)60 (*EndCol*)43)) :: (63, (sloc (*Line*)55 (*Col*)9 (*EndLine*)55 (*EndCol*)11)) :: (99, (sloc (*Line*)66 (*Col*)9 (*EndLine*)66 (*EndCol*)11)) :: (54, (sloc (*Line*)50 (*Col*)30 (*EndLine*)50 (*EndCol*)30)) :: (341, (sloc (*Line*)128 (*Col*)17 (*EndLine*)128 (*EndCol*)35)) :: (171, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)15)) :: (144, (sloc (*Line*)74 (*Col*)43 (*EndLine*)74 (*EndCol*)49)) :: (81, (sloc (*Line*)59 (*Col*)14 (*EndLine*)59 (*EndCol*)16)) :: (153, (sloc (*Line*)75 (*Col*)27 (*EndLine*)75 (*EndCol*)30)) :: (126, (sloc (*Line*)70 (*Col*)12 (*EndLine*)70 (*EndCol*)14)) :: (359, (sloc (*Line*)135 (*Col*)25 (*EndLine*)135 (*EndCol*)38)) :: (368, (sloc (*Line*)138 (*Col*)23 (*EndLine*)138 (*EndCol*)23)) :: (27, (sloc (*Line*)36 (*Col*)32 (*EndLine*)36 (*EndCol*)32)) :: (108, (sloc (*Line*)67 (*Col*)14 (*EndLine*)67 (*EndCol*)16)) :: (117, (sloc (*Line*)67 (*Col*)40 (*EndLine*)67 (*EndCol*)42)) :: (323, (sloc (*Line*)123 (*Col*)39 (*EndLine*)123 (*EndCol*)41)) :: (362, (sloc (*Line*)135 (*Col*)38 (*EndLine*)135 (*EndCol*)38)) :: (263, (sloc (*Line*)106 (*Col*)14 (*EndLine*)106 (*EndCol*)17)) :: (344, (sloc (*Line*)128 (*Col*)21 (*EndLine*)128 (*EndCol*)23)) :: (272, (sloc (*Line*)110 (*Col*)12 (*EndLine*)110 (*EndCol*)14)) :: (84, (sloc (*Line*)59 (*Col*)27 (*EndLine*)59 (*EndCol*)30)) :: (102, (sloc (*Line*)66 (*Col*)21 (*EndLine*)66 (*EndCol*)23)) :: (335, (sloc (*Line*)127 (*Col*)16 (*EndLine*)127 (*EndCol*)25)) :: (308, (sloc (*Line*)120 (*Col*)22 (*EndLine*)120 (*EndCol*)24)) :: (75, (sloc (*Line*)58 (*Col*)25 (*EndLine*)58 (*EndCol*)34)) :: (290, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)30)) :: (39, (sloc (*Line*)45 (*Col*)23 (*EndLine*)45 (*EndCol*)23)) :: (111, (sloc (*Line*)67 (*Col*)20 (*EndLine*)67 (*EndCol*)22)) :: (230, (sloc (*Line*)94 (*Col*)12 (*EndLine*)94 (*EndCol*)16)) :: (51, (sloc (*Line*)48 (*Col*)23 (*EndLine*)48 (*EndCol*)27)) :: (257, (sloc (*Line*)104 (*Col*)22 (*EndLine*)104 (*EndCol*)24)) :: (347, (sloc (*Line*)128 (*Col*)28 (*EndLine*)128 (*EndCol*)30)) :: (338, (sloc (*Line*)127 (*Col*)30 (*EndLine*)127 (*EndCol*)39)) :: (221, (sloc (*Line*)88 (*Col*)35 (*EndLine*)88 (*EndCol*)44)) :: (320, (sloc (*Line*)123 (*Col*)26 (*EndLine*)123 (*EndCol*)28)) :: (329, (sloc (*Line*)124 (*Col*)35 (*EndLine*)124 (*EndCol*)44)) :: (212, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)29)) :: (275, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)30)) :: (284, (sloc (*Line*)112 (*Col*)19 (*EndLine*)112 (*EndCol*)21)) :: (311, (sloc (*Line*)120 (*Col*)32 (*EndLine*)120 (*EndCol*)32)) :: (293, (sloc (*Line*)116 (*Col*)17 (*EndLine*)116 (*EndCol*)19)) :: (365, (sloc (*Line*)138 (*Col*)9 (*EndLine*)138 (*EndCol*)23)) :: (314, (sloc (*Line*)121 (*Col*)19 (*EndLine*)121 (*EndCol*)23)) :: (179, (sloc (*Line*)82 (*Col*)44 (*EndLine*)82 (*EndCol*)56)) :: (152, (sloc (*Line*)75 (*Col*)23 (*EndLine*)75 (*EndCol*)30)) :: (188, (sloc (*Line*)83 (*Col*)25 (*EndLine*)83 (*EndCol*)34)) :: (170, (sloc (*Line*)82 (*Col*)13 (*EndLine*)82 (*EndCol*)15)) :: (143, (sloc (*Line*)74 (*Col*)30 (*EndLine*)74 (*EndCol*)32)) :: (215, (sloc (*Line*)87 (*Col*)19 (*EndLine*)87 (*EndCol*)21)) :: (242, (sloc (*Line*)98 (*Col*)17 (*EndLine*)98 (*EndCol*)19)) :: (251, (sloc (*Line*)104 (*Col*)9 (*EndLine*)104 (*EndCol*)24)) :: (197, (sloc (*Line*)84 (*Col*)30 (*EndLine*)84 (*EndCol*)36)) :: (206, (sloc (*Line*)86 (*Col*)16 (*EndLine*)86 (*EndCol*)25)) :: (296, (sloc (*Line*)116 (*Col*)30 (*EndLine*)116 (*EndCol*)30)) :: (278, (sloc (*Line*)111 (*Col*)14 (*EndLine*)111 (*EndCol*)16)) :: (305, (sloc (*Line*)120 (*Col*)14 (*EndLine*)120 (*EndCol*)16)) :: nil)
  (* = = = (6) name id to a pair of (name string, unique name string) map = = = *)
  (*/////////////////////////////////////////////////*)
  ((mkNameTable
  (*///////////////////////////////////*)
  (* = = = (1) variable names map = = = *)
  (*///////////////////////////////////*)
  ((23, ("CBF", "ada://constant/ACATS_C53007A+31:11/CBF+38:6")) :: (26, ("VBT", "ada://variable/ACATS_C53007A+31:11/VBT+47:6")) :: (20, ("CI9", "ada://constant/ACATS_C53007A+31:11/CI9+36:6")) :: (22, ("CBT", "ada://constant/ACATS_C53007A+31:11/CBT+37:6")) :: (25, ("VI9", "ada://variable/ACATS_C53007A+31:11/VI9+46:6")) :: (28, ("FLOW_COUNT", "ada://variable/ACATS_C53007A+31:11/FLOW_COUNT+50:6")) :: (19, ("CI1", "ada://constant/ACATS_C53007A+31:11/CI1+35:6")) :: (27, ("VBF", "ada://variable/ACATS_C53007A+31:11/VBF+48:6")) :: (24, ("VI1", "ada://variable/ACATS_C53007A+31:11/VI1+45:6")) :: nil)
  (*////////////////////////////////////////////*)
  (* = = = (2) subprogram names map = = = *)
  (*////////////////////////////////////////////*)
  ((17, ("ACATS_C53007A", "ada://procedure_body/ACATS_C53007A+31:11")) :: (8, ("IDENT_INT", "ada://expression_function/ACATS_REPORT-47:9/IDENT_INT-112:15")) :: (11, ("IDENT_BOOL", "ada://expression_function/ACATS_REPORT-47:9/IDENT_BOOL-129:15")) :: (2, ("TEST", "ada://procedure/ACATS_REPORT-47:9/TEST-53:16")) :: (5, ("SPECIAL_ACTION", "ada://procedure/ACATS_REPORT-47:9/SPECIAL_ACTION-85:16")) :: (14, ("EQUAL", "ada://expression_function/ACATS_REPORT-47:9/EQUAL-144:15")) :: (4, ("NOT_APPLICABLE", "ada://procedure/ACATS_REPORT-47:9/NOT_APPLICABLE-75:16")) :: (13, ("IDENT_WIDE_STR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_WIDE_STR-139:15")) :: (16, ("TIME_STAMP", "ada://function/ACATS_REPORT-47:9/TIME_STAMP-159:15")) :: (7, ("RESULT", "ada://procedure/ACATS_REPORT-47:9/RESULT-99:16")) :: (10, ("IDENT_WIDE_CHAR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_WIDE_CHAR-123:15")) :: (9, ("IDENT_CHAR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_CHAR-117:15")) :: (3, ("FAILED", "ada://procedure/ACATS_REPORT-47:9/FAILED-65:16")) :: (12, ("IDENT_STR", "ada://expression_function/ACATS_REPORT-47:9/IDENT_STR-134:15")) :: (15, ("LEGAL_FILE_NAME", "ada://function/ACATS_REPORT-47:9/LEGAL_FILE_NAME-152:15")) :: (6, ("COMMENT", "ada://procedure/ACATS_REPORT-47:9/COMMENT-94:16")) :: nil)
  (*//////////////////////////////////////*)
  (* = = = (3) package names map = = = *)
  (*//////////////////////////////////////*)
  (nil)
  (*/////////////////////////////////////*)
  (* = = = (4) type names map = = = *)
  (*/////////////////////////////////////*)
  ((1, ("FILE_NUM", "ada://subtype/ACATS_REPORT-47:9/FILE_NUM-49:14")) :: nil)
))
).

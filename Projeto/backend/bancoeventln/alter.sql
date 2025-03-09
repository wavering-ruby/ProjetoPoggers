
ALTER TABLE "eventos" ADD CONSTRAINT "eventos_fk6" FOREIGN KEY ("id_organizador") REFERENCES "usuario"("id_usuario");

ALTER TABLE "eventos" ADD CONSTRAINT "eventos_fk7" FOREIGN KEY ("id_categoria") REFERENCES "categorias"("id_categoria");
ALTER TABLE "inscrição" ADD CONSTRAINT "inscrição_fk1" FOREIGN KEY ("id_participante") REFERENCES "usuario"("id_usuario");

ALTER TABLE "inscrição" ADD CONSTRAINT "inscrição_fk2" FOREIGN KEY ("id_evento") REFERENCES "eventos"("id_evento");
ALTER TABLE "participação" ADD CONSTRAINT "participação_fk1" FOREIGN KEY ("id_participante") REFERENCES "usuario"("id_usuario");

ALTER TABLE "participação" ADD CONSTRAINT "participação_fk2" FOREIGN KEY ("id_evento") REFERENCES "eventos"("id_evento");

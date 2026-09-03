package pa;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new xa.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            sa.l lVar = new sa.l(sa.l.F);
            lVar.B = new Object[32];
            lVar.C = 0;
            lVar.D = new String[32];
            lVar.E = new int[32];
            lVar.L(iVar);
            return read(lVar);
        } catch (IOException e6) {
            throw new j(e6);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(xa.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new xa.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            sa.n nVar = new sa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e6) {
            throw new j(e6);
        }
    }

    public abstract void write(xa.b bVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new j(e6);
        }
    }
}

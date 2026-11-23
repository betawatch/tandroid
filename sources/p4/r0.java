package p4;

import c8.u9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements h2.j, b1, a1, q2.l, androidx.car.app.utils.b {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i7) {
        this.a = i7;
    }

    public static qi.a b() {
        InputStream open = org.telegram.messenger.t0.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new qi.a(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p4.a1
    public void a(h1 h1Var, v vVar, List list) {
        switch (this.a) {
            case 9:
                h1Var.y0(list);
                break;
            default:
                h1Var.y0(list);
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        h1 h1Var = (h1) obj;
        switch (this.a) {
            case 0:
                h1Var.D0();
                break;
            case 1:
                h1Var.M0();
                break;
            case 2:
                h1Var.V();
                break;
            case 3:
                h1Var.F();
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case 15:
            default:
                h1Var.w();
                break;
            case 5:
                h1Var.K0();
                break;
            case 6:
                h1Var.I0();
                break;
            case 8:
                h1Var.M();
                break;
            case 12:
                h1Var.stop();
                break;
            case 13:
                h1Var.d0();
                break;
            case 14:
                h1Var.H();
                break;
            case 16:
                h1Var.a();
                break;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // p4.b1
    public Object j(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 4:
                d0Var.getClass();
                throw new ClassCastException();
            case 7:
                w7.s sVar = d0Var.e;
                d0Var.s(vVar);
                sVar.getClass();
                return u9.b(new n1(-6));
            case 11:
                d0Var.getClass();
                throw new ClassCastException();
            case 15:
                d0Var.getClass();
                throw new ClassCastException();
            case 17:
                d0Var.getClass();
                throw new ClassCastException();
            case 19:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                w7.s sVar2 = d0Var.e;
                d0Var.s(vVar);
                sVar2.getClass();
                return u9.b(new n1(-6));
        }
    }

    public /* synthetic */ r0(r.a aVar, int i7, w.b bVar) {
        this.a = 26;
    }

    @Override // q2.l
    public void release() {
    }
}

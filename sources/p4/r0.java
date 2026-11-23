package p4;

import c8.t9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements h2.j, c1, b1, q2.l, androidx.car.app.utils.b {
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

    @Override // p4.b1
    public void a(i1 i1Var, v vVar, List list) {
        switch (this.a) {
            case 9:
                i1Var.x0(list);
                break;
            default:
                i1Var.x0(list);
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        i1 i1Var = (i1) obj;
        switch (this.a) {
            case 0:
                i1Var.C0();
                break;
            case 1:
                i1Var.L0();
                break;
            case 2:
                i1Var.U();
                break;
            case 3:
                i1Var.E();
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case 15:
            default:
                i1Var.v();
                break;
            case 5:
                i1Var.J0();
                break;
            case 6:
                i1Var.H0();
                break;
            case 8:
                i1Var.L();
                break;
            case 12:
                i1Var.stop();
                break;
            case 13:
                i1Var.c0();
                break;
            case 14:
                i1Var.G();
                break;
            case 16:
                i1Var.a();
                break;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // p4.c1
    public Object k(e0 e0Var, v vVar, int i7) {
        switch (this.a) {
            case 4:
                e0Var.getClass();
                throw new ClassCastException();
            case 7:
                w7.s sVar = e0Var.e;
                e0Var.s(vVar);
                sVar.getClass();
                return t9.b(new o1(-6));
            case 11:
                e0Var.getClass();
                throw new ClassCastException();
            case 15:
                e0Var.getClass();
                throw new ClassCastException();
            case 17:
                e0Var.getClass();
                throw new ClassCastException();
            case 19:
                e0Var.getClass();
                throw new ClassCastException();
            default:
                w7.s sVar2 = e0Var.e;
                e0Var.s(vVar);
                sVar2.getClass();
                return t9.b(new o1(-6));
        }
    }

    public /* synthetic */ r0(r.a aVar, int i7, w.b bVar) {
        this.a = 26;
    }

    @Override // q2.l
    public void release() {
    }
}

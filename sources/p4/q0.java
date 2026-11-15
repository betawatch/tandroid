package p4;

import c8.r9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements h2.j, a1, z0, q2.m, androidx.car.app.utils.b {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i7) {
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

    @Override // p4.z0
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.a) {
            case 8:
                g1Var.x0(list);
                break;
            default:
                g1Var.x0(list);
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.a) {
            case 0:
                g1Var.L0();
                break;
            case 1:
                g1Var.U();
                break;
            case 2:
                g1Var.E();
                break;
            case 3:
            case 6:
            case 8:
            case 9:
            case 10:
            case 14:
            default:
                g1Var.v();
                break;
            case 4:
                g1Var.J0();
                break;
            case 5:
                g1Var.H0();
                break;
            case 7:
                g1Var.L();
                break;
            case 11:
                g1Var.stop();
                break;
            case 12:
                g1Var.c0();
                break;
            case 13:
                g1Var.G();
                break;
            case 15:
                g1Var.a();
                break;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // p4.a1
    public Object k(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 3:
                d0Var.getClass();
                throw new ClassCastException();
            case 6:
                w7.s sVar = d0Var.e;
                d0Var.s(vVar);
                sVar.getClass();
                return r9.b(new m1(-6));
            case 10:
                d0Var.getClass();
                throw new ClassCastException();
            case 14:
                d0Var.getClass();
                throw new ClassCastException();
            case 16:
                d0Var.getClass();
                throw new ClassCastException();
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                w7.s sVar2 = d0Var.e;
                d0Var.s(vVar);
                sVar2.getClass();
                return r9.b(new m1(-6));
        }
    }

    public /* synthetic */ q0(r.a aVar, int i7, w.b bVar) {
        this.a = 25;
    }

    @Override // q2.m
    public void release() {
    }
}

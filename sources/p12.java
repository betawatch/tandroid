// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p12 implements qcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p12(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qcc
    public final Object a(Object obj) {
        gc1 gc1Var;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                r47 r47Var = (r47) obj;
                ((x12) obj2).P = r47Var;
                return Boolean.valueOf(MediaController.z().q0(qd4.t(r47Var), r47Var, 0L, true, null, 0L));
            case 1:
                gh8 gh8Var = (gh8) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                ggb c = lp3.c((aob.I.o() ? 3 : 6) * 0.12f, aob.Gc);
                c.t = true;
                c.m = aob.hf;
                imageReceiver.a0(jn5.p(jxc.b(gh8Var.b.geo, jn7.W4, jn7.x2, 15, Math.min(2, (int) Math.ceil(hl.p)))), null, null, null, new jj2(c), null, 0);
                view.addOnAttachStateChangeListener(new fh8(imageReceiver, objArr == true ? 1 : 0));
                imageReceiver.q0(hl.L(14.0f));
                return new ya1(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate(), b2);
            case 2:
                return ((View) obj).getParent() != ((m15) obj2).c ? Boolean.FALSE : Boolean.valueOf(!l9c.K(r0.U(r1).f));
            case 3:
                Paint[] paintArr = ((lf5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                wy5 wy5Var = (wy5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    n12 n12Var = new n12(wy5Var.getContext(), new my5(wy5Var), false, false, false, wy5Var.A1);
                    n12Var.n = true;
                    n12Var.w1(ob6.M0(2131754421, null));
                    n12Var.W3 = new ym4(wy5Var, n12Var, objArr2 == true ? 1 : 0, b2);
                    n12Var.setOnDismissListener(new h5((byte) 5));
                    n12Var.u1(1, false);
                    n12Var.a1();
                    MediaController.h2 = true;
                    n12Var.d2.g0();
                    n12Var.show();
                } else if (num.intValue() == 6 && (gc1Var = wy5Var.J1) != null) {
                    gc1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                zg6 zg6Var = (zg6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    return Boolean.FALSE;
                }
                hl.c3(new ug6(zg6Var, b3));
                return Boolean.TRUE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                if (uRLSpan == null) {
                    return Boolean.FALSE;
                }
                profileActivity.f3(uRLSpan.getURL(), null);
                return Boolean.TRUE;
            case 7:
                int i = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == 1);
            case 8:
                r47 r47Var2 = (r47) obj;
                ((r1a) obj2).k2 = r47Var2;
                return Boolean.valueOf(MediaController.z().q0(qd4.t(r47Var2), r47Var2, 0L, true, null, 0L));
            case 9:
                uya uyaVar = (uya) obj2;
                return uyaVar.r[((Integer) obj).intValue() % uyaVar.r.length];
            case 10:
                rhb rhbVar = (rhb) obj2;
                return rhbVar.r[((Integer) obj).intValue() % rhbVar.r.length];
            case 11:
                return ((View) obj).getParent() != ((q9c) obj2) ? Boolean.FALSE : Boolean.valueOf(!l9c.K(r0.U(r1).f));
            default:
                return new zwc((xt) obj2, (Integer) obj, b4);
        }
    }
}

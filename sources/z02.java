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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z02 implements q8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q8c
    public final Object a(Object obj) {
        yb1 yb1Var;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b4 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k27 k27Var = (k27) obj;
                ((h12) obj2).P = k27Var;
                return Boolean.valueOf(MediaController.w().n0(tb4.t(k27Var), k27Var, 0L, true, null, 0L));
            case 1:
                sd8 sd8Var = (sd8) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                kcb c = uo3.c((bkb.I.o() ? 3 : 6) * 0.12f, bkb.Fc);
                c.t = true;
                c.m = bkb.gf;
                imageReceiver.a0(gl5.p(usc.b(sd8Var.b.geo, kk7.W4, kk7.x2, 15, Math.min(2, (int) Math.ceil(gl.p)))), null, null, null, new ni2(c), null, 0);
                view.addOnAttachStateChangeListener(new rd8(imageReceiver, objArr == true ? 1 : 0));
                imageReceiver.q0(gl.L(14.0f));
                return new qa1(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate(), b2);
            case 2:
                return ((View) obj).getParent() != ((iz4) obj2).c ? Boolean.FALSE : Boolean.valueOf(!l5c.K(r0.T(r1).f));
            case 3:
                Paint[] paintArr = ((kd5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                rw5 rw5Var = (rw5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    x02 x02Var = new x02(rw5Var.getContext(), new hw5(rw5Var), false, false, false, rw5Var.G1);
                    x02Var.n = true;
                    x02Var.v1(k96.M0(2131754425, null));
                    x02Var.W3 = new sk4(rw5Var, x02Var, objArr2 == true ? 1 : 0, b2);
                    x02Var.setOnDismissListener(new g5((byte) 5));
                    x02Var.t1(1, false);
                    x02Var.Z0();
                    MediaController.h2 = true;
                    x02Var.d2.h0();
                    x02Var.show();
                } else if (num.intValue() == 6 && (yb1Var = rw5Var.P1) != null) {
                    yb1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                ve6 ve6Var = (ve6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    return Boolean.FALSE;
                }
                gl.c3(new re6(ve6Var, b3));
                return Boolean.TRUE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                if (uRLSpan == null) {
                    return Boolean.FALSE;
                }
                profileActivity.e3(uRLSpan.getURL(), null);
                return Boolean.TRUE;
            case 7:
                int i = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == 1);
            case 8:
                k27 k27Var2 = (k27) obj;
                ((yx9) obj2).k2 = k27Var2;
                return Boolean.valueOf(MediaController.w().n0(tb4.t(k27Var2), k27Var2, 0L, true, null, 0L));
            case 9:
                qua quaVar = (qua) obj2;
                return quaVar.r[((Integer) obj).intValue() % quaVar.r.length];
            case 10:
                wdb wdbVar = (wdb) obj2;
                return wdbVar.r[((Integer) obj).intValue() % wdbVar.r.length];
            case 11:
                return ((View) obj).getParent() != ((q5c) obj2) ? Boolean.FALSE : Boolean.valueOf(!l5c.K(r0.T(r1).f));
            default:
                return new isc((wt) obj2, (Integer) obj, b4);
        }
    }
}

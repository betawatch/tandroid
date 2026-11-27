// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tu1 implements ResultCallback, fd {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tu1(xu1 xu1Var, ez3 ez3Var, boolean z, ih7 ih7Var, int i) {
        this.c = xu1Var;
        this.d = ez3Var;
        this.b = z;
        this.e = ih7Var;
        this.a = i;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        xu1 xu1Var = (xu1) this.c;
        ez3 ez3Var = (ez3) this.d;
        ih7 ih7Var = (ih7) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((avc) pair.second).a;
            ez3 ez3Var2 = xu1Var.f;
            if (ez3Var2 == null || longValue != ez3Var2.h(xu1Var.q ? 1 : 0) || bitmap == null) {
                return;
            }
            ValueAnimator valueAnimator = xu1Var.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i = ez3Var.j(this.b ? 1 : 0).settings.intensity;
            List list = ((avc) pair.second).b;
            ih7Var.R = list;
            long j = xu1Var.G.ob;
            if (list != null) {
                ih7Var.S = new Random(j).nextInt(ih7Var.R.size());
            }
            ih7Var.r(i, bitmap);
            ih7Var.s(this.a);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            xu1Var.i = ofFloat;
            ofFloat.addUpdateListener(new su1(ih7Var, (byte) 2));
            xu1Var.i.setDuration(250L);
            xu1Var.i.start();
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        q84 q84Var = (q84) this.c;
        m84 m84Var = (m84) this.d;
        r47 r47Var = (r47) this.e;
        if (m84Var.getText().toString().length() > this.a) {
            hl.z3(m84Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {m84Var.getText()};
        tL_textWithEntities.entities = ls6.d0(q84Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        q84Var.a(r47Var, tL_textWithEntities, this.b);
        idVar.dismiss();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public /* synthetic */ tu1(q84 q84Var, m84 m84Var, int i, r47 r47Var, boolean z) {
        this.c = q84Var;
        this.d = m84Var;
        this.a = i;
        this.e = r47Var;
        this.b = z;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}

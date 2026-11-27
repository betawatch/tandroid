// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wbc extends rq4 {
    public final m7 L;
    public final /* synthetic */ xbc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbc(xbc xbcVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.M = xbcVar;
        m7 m7Var = this.r;
        this.L = m7Var;
        m7Var.setImeOptions(268435459);
        m7Var.setHint(ob6.M0(2131742991, null));
        m7Var.addTextChangedListener(new nh6(this, (byte) 22));
        m7Var.setOnEditorActionListener(new j(this, (byte) 28));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M.F0(motionEvent, this.L);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

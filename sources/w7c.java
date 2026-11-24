// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w7c extends no4 {
    public final l7 K;
    public final /* synthetic */ x7c L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7c(x7c x7cVar, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = x7cVar;
        l7 l7Var = this.r;
        this.K = l7Var;
        l7Var.setImeOptions(268435459);
        l7Var.setHint(k96.M0(2131743097, null));
        l7Var.addTextChangedListener(new jf6(this, (byte) 21));
        l7Var.setOnEditorActionListener(new j(this, (byte) 28));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.E0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x9c extends oq4 {
    public final l7 K;
    public final /* synthetic */ y9c L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9c(y9c y9cVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.L = y9cVar;
        l7 l7Var = this.r;
        this.K = l7Var;
        l7Var.setImeOptions(268435459);
        l7Var.setHint(jb6.M0(2131743023, null));
        l7Var.addTextChangedListener(new og6(this, (byte) 22));
        l7Var.setOnEditorActionListener(new j(this, (byte) 29));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.E0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

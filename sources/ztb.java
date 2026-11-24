// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ztb extends View {
    public final aub a;
    public p8c b;
    public final wjb c;
    public int d;

    public ztb(int i, wjb wjbVar, Context context) {
        super(context);
        this.c = wjbVar;
        aub aubVar = new aub(i, this, wjbVar, false);
        this.a = aubVar;
        aubVar.s = new cib(this, (byte) 11);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wjb wjbVar = this.c;
        if (wjbVar != null) {
            wjbVar.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            bkb.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(k27 k27Var) {
        aub aubVar = this.a;
        aubVar.e(k27Var);
        if (isAttachedToWindow()) {
            aubVar.a();
        }
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public void setOnTopicClickListener(p8c p8cVar) {
        this.b = p8cVar;
    }
}

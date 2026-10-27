package sg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import fi.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x2 extends j {
    public final s0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public final pc u0;

    public x2(Context context, PointF pointF, int i10, pc pcVar, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.q0 = s0Var;
        s0Var.setMaxWidth(i11);
        s0Var.e(0, this.s0);
        this.u0 = pcVar;
        String str = pcVar.c;
        String a2 = pcVar.a();
        s0Var.d(i10, str);
        s0Var.setText(a2);
        m();
        addView(s0Var, kb1.i(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // sg.j
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // sg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // sg.j
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new il0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = wh.y(dp, 2.0f, getPositionX(), scaleX);
        return new il0(y3, wh.y(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override // sg.j
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // sg.j
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // sg.j
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // sg.j
    public float getStickyPaddingTop() {
        return this.q0.J;
    }

    public int getType() {
        return this.t0;
    }

    public int getTypesCount() {
        return this.q0.getTypesCount() - (!this.r0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.r0 = true;
        this.s0 = i10;
    }

    @Override // sg.j
    public void setIsVideo(boolean z10) {
        this.q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.t0 = i10;
        this.q0.e(i10, this.s0);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u70 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(w70 w70Var, Context context) {
        super(context);
        this.f = w70Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        eh.d c10 = w70Var.getBaseSimpleGlass().c.c(this, null, false);
        c10.v(gh.c.m(w70Var.getResourceProvider()));
        c10.w(AndroidUtilities.dp(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(w70Var.e, org.telegram.ui.Components.gb1.g(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewArr;
        org.telegram.ui.Components.t61 G;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.e;
                eh.d dVar = (eh.d) this.d;
                float f7 = ((w70) this.f).a.f;
                if (f7 >= 1.0f) {
                    float min = Math.min(1.0f, f7 / AndroidUtilities.dp(44.0f));
                    float dp = (1.0f - min) * AndroidUtilities.dp(24.0f);
                    rectF.set(dp, 0.0f, getWidth() - dp, f7);
                    float min2 = Math.min(f7 / 2.0f, AndroidUtilities.dp(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        dVar.x(min2);
                    }
                    int dp2 = AndroidUtilities.dp(6.0f);
                    dVar.setBounds(((int) rectF.left) - dp2, ((int) rectF.top) - dp2, ((int) rectF.right) + dp2, ((int) rectF.bottom) + dp2);
                    dVar.setAlpha((int) (min * 255.0f));
                    dVar.draw(canvas);
                    canvas.save();
                    Path path = this.c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                v21 v21Var = (v21) this.f;
                View[] viewPages = v21Var.b.getViewPages();
                float f10 = 0.0f;
                this.b = 0.0f;
                int length = viewPages.length;
                int i12 = 0;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        u21 u21Var = (u21) view;
                        FrameLayout frameLayout = u21Var.e;
                        org.telegram.ui.Components.r71 r71Var = u21Var.f;
                        float clamp = Utilities.clamp(1.0f - Math.abs(u21Var.getTranslationX() / u21Var.getMeasuredWidth()), 1.0f, f10);
                        float f11 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i13 = 0;
                        while (true) {
                            int childCount = r71Var.getChildCount();
                            org.telegram.ui.Components.j71 j71Var = r71Var.g3;
                            if (i13 < childCount) {
                                View childAt = r71Var.getChildAt(i13);
                                r71Var.f3.getClass();
                                int H = s4.p0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < j71Var.y.size() && (G = j71Var.G(H)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i13++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.b = (paddingTop * clamp) + f11;
                                if (u21Var.getVisibility() == 0) {
                                    bi.j5 j5Var = u21Var.h;
                                    float f12 = -j5Var.getHeight();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < r71Var.getChildCount()) {
                                            View childAt2 = r71Var.getChildAt(i14);
                                            r71Var.f3.getClass();
                                            if (j71Var.G(s4.p0.H(childAt2)).a == 28) {
                                                f12 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                    j5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                                }
                            }
                        }
                    }
                    i12++;
                    viewPages = viewArr;
                    f10 = 0.0f;
                }
                float d = ((org.telegram.ui.Components.h6) this.d).d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                float f13 = AndroidUtilities.statusBarHeight;
                float f14 = f13 * d;
                this.b = Math.max(f13, this.b) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF2 = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.k3) v21Var).backgroundPaddingLeft;
                float f15 = this.b;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.k3) v21Var).backgroundPaddingLeft;
                rectF2.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF2, lerp, lerp, v21Var.c);
                canvas.save();
                Path path2 = this.c;
                path2.rewind();
                path2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z10 = f14 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z10) {
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(v21Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f;
                    boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(v21Var.getThemedColor(org.telegram.ui.ActionBar.y6.s8), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(v21Var.getWindow(), z11);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((w70) this.f).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((v21) this.f).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((w70) this.f).w, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(v21 v21Var, Context context) {
        super(context);
        this.f = v21Var;
        this.d = new org.telegram.ui.Components.h6(this, 250L, org.telegram.ui.Components.ds.h);
        this.c = new Path();
    }
}

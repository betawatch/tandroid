// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y37 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j47 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y37(j47 j47Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = j47Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                z37 z37Var = j47Var.a0;
                z37Var.e(canvas);
                ArrayList arrayList = z37Var.G;
                float f = -1.0f;
                if (!arrayList.isEmpty()) {
                    yu3 yu3Var = (yu3) b00.f(1, arrayList);
                    ImageReceiver imageReceiver = yu3Var.r;
                    gl5 gl5Var = imageReceiver.g0;
                    if (gl5Var == null) {
                        gl5Var = imageReceiver.P;
                    }
                    if (gl5Var == null) {
                        gl5Var = imageReceiver.X;
                    }
                    if (gl5Var != null) {
                        String str = yu3Var.s;
                        if (str == null) {
                            TLRPC.Document document = gl5Var.i;
                            if (document != null) {
                                str = ba4.r("tgs", document);
                                yu3Var.s = str;
                            } else {
                                str = ba4.r("tgs", gl5Var.f);
                                yu3Var.s = str;
                            }
                        }
                        if (str != null) {
                            Float s = fl5.z().s(yu3Var.s);
                            if (s == null) {
                                s = Float.valueOf(1.0f);
                            }
                            f = (s.floatValue() * 0.55f) + 0.15f + (s.floatValue() * 0.3f);
                        }
                    }
                }
                if (f != -2.0f) {
                    j47Var.X.h(f >= 0.0f && f < 1.0f);
                }
                if (!z37Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                if (j47Var.E <= 0.0f || j47Var.h == null) {
                    canvas2 = canvas;
                } else {
                    j47Var.n.reset();
                    float width = getWidth() / j47Var.e.getWidth();
                    j47Var.n.postScale(width, width);
                    j47Var.f.setLocalMatrix(j47Var.n);
                    j47Var.h.setAlpha((int) (j47Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), j47Var.h);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                j47 j47Var = this.b;
                if (!j47Var.g0 || j47Var.h0) {
                    ArrayList arrayList = j47Var.N;
                    f47 f47Var = j47Var.K;
                    if (j47Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        j47Var.b(iArr);
                        j47Var.X.setScaleX(j47Var.W.getScaleX());
                        j47Var.X.setScaleY(j47Var.W.getScaleY());
                        int[] iArr2 = j47Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (f47Var.getMeasuredHeight() - j47Var.X.getHeight()) + (j47Var.e0 != null ? gl.L(320.0f) : 0);
                        int L = gl.L(8.0f) + j47Var.d.b;
                        int L2 = gl.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = j47Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (j47Var.G.getMeasuredHeight() - gl.L(8.0f)) - j47Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (j47Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - j47Var.W.getHeight();
                        }
                        j47Var.X.setX(gl.L(6.0f) + (iArr[0] - (r11.getWidth() - j47Var.X.l())));
                        j47Var.X.setY(iArr[1]);
                        if (j47Var.p0) {
                            iArr[0] = iArr[0] - (j47Var.Y - j47Var.W.l());
                        }
                        f47Var.setX((gl.L(7.0f) + iArr[0]) - f47Var.getMeasuredWidth());
                        if (j47Var.g0) {
                            ug8.t(f47Var.animate().translationY(((j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight()) - f47Var.getTop()), la2.V, 250L);
                        } else {
                            f47Var.setY((j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = j47Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((gl.L(7.0f) + iArr[0]) - j47Var.Z.getMeasuredWidth());
                            j47Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -gl.L(6.0f) : j47Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = j47Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(b00.c(6.0f, (j47Var.X.l() + iArr[0]) - j47Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = j47Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = j47Var.d0;
                                float max = Math.max(j47Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                j47Var.c0 = max;
                                frameLayout2.setY(max);
                                b47 b47Var = j47Var.e0;
                                if (b47Var != null) {
                                    b47Var.setY(Math.max(j47Var.d.b, (j47Var.l0.top - gl.L(24.0f)) - j47Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = j47Var.d0;
                                float max2 = Math.max(j47Var.d.b, height - frameLayout3.getMeasuredHeight()) + gl.L(24.0f);
                                j47Var.c0 = max2;
                                frameLayout3.setY(max2);
                                b47 b47Var2 = j47Var.e0;
                                if (b47Var2 != null) {
                                    b47Var2.setY(Math.max(0.0f, (height - b47Var2.getMeasuredHeight()) - j47Var.c0));
                                }
                            }
                        }
                    }
                    j47Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                j47 j47Var = this.b;
                tk0.c(j47Var.j0, j47Var.F);
                ViewGroup viewGroup = j47Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}

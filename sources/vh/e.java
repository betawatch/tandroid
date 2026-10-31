package vh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k kVar = this.b;
        switch (i10) {
            case 0:
                kVar.t();
                break;
            default:
                boolean z10 = kVar.l0;
                FrameLayout frameLayout = kVar.J;
                h hVar = kVar.r;
                f fVar = kVar.f;
                if (kVar.o0 != z10) {
                    kVar.o0 = z10;
                    ValueAnimator valueAnimator = kVar.p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.p0 = null;
                    }
                    q20 q20Var = kVar.j0;
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(z10));
                    }
                    kVar.d(z10);
                    if (z10) {
                        oh ohVar = kVar.M;
                        if (ohVar != null) {
                            ohVar.setVisibility(0);
                        }
                        hVar.setVisibility(0);
                    } else {
                        fVar.getEditText().scrollBy(0, -fVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kVar.n0, z10 ? 1.0f : 0.0f);
                    kVar.p0 = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(kVar, 24));
                    if (!z10) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.p0.addListener(new sg.y(8, kVar, z10));
                    if (z10) {
                        kVar.p0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                        kVar.p0.setDuration(250L);
                    } else {
                        kVar.p0.setInterpolator(new u1.a());
                        kVar.p0.setDuration(420L);
                    }
                    kVar.p0.start();
                    mt editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        fVar.setSelection(z10 ? fVar.a.length() : 0);
                        fVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        kVar.f0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.f0.setInterpolator(gr.h);
                        kVar.f0.start();
                    }
                    fVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        fVar.getEditText().j(false, true);
                    }
                    if (z10 && tz.o() >= 1 && !sc.f()) {
                        if (kVar.q0 == null) {
                            kVar.q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.x0 = true;
                        kVar.i(kVar.q0);
                        kVar.x0 = false;
                        Bitmap bitmap = kVar.q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.s0;
                            if (matrix == null) {
                                kVar.s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.r0.setLocalMatrix(kVar.s0);
                            if (kVar.t0 == null) {
                                Paint paint = new Paint(3);
                                kVar.t0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.t0.setShader(kVar.r0);
                            break;
                        } else {
                            kVar.q0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}

package ph;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.zh;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
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
                boolean z4 = kVar.j0;
                FrameLayout frameLayout = kVar.G;
                h hVar = kVar.r;
                f fVar = kVar.f;
                if (kVar.m0 != z4) {
                    kVar.m0 = z4;
                    ValueAnimator valueAnimator = kVar.n0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kVar.n0 = null;
                    }
                    Utilities.Callback callback = kVar.h0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z4));
                    }
                    kVar.d(z4);
                    if (z4) {
                        zh zhVar = kVar.J;
                        if (zhVar != null) {
                            zhVar.setVisibility(0);
                        }
                        hVar.setVisibility(0);
                    } else {
                        fVar.getEditText().scrollBy(0, -fVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kVar.l0, z4 ? 1.0f : 0.0f);
                    kVar.n0 = ofFloat;
                    ofFloat.addUpdateListener(new nh.e5(kVar, 12));
                    if (!z4) {
                        fVar.getEditText().setAllowDrawCursor(false);
                    }
                    kVar.n0.addListener(new s61(7, kVar, z4));
                    if (z4) {
                        kVar.n0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        kVar.n0.setDuration(250L);
                    } else {
                        kVar.n0.setInterpolator(new u1.a());
                        kVar.n0.setDuration(420L);
                    }
                    kVar.n0.start();
                    ut editText = fVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = kVar.d0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        fVar.setSelection(z4 ? fVar.a.length() : 0);
                        fVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z4 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        kVar.d0 = ofInt;
                        ofInt.setDuration(360L);
                        kVar.d0.setInterpolator(mr.h);
                        kVar.d0.start();
                    }
                    fVar.setSuggestionsEnabled(z4);
                    if (!z4) {
                        fVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z4 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (kVar.o0 == null) {
                            kVar.o0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        kVar.v0 = true;
                        kVar.i(kVar.o0);
                        kVar.v0 = false;
                        Bitmap bitmap = kVar.o0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = kVar.o0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            kVar.p0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = kVar.q0;
                            if (matrix == null) {
                                kVar.q0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            kVar.p0.setLocalMatrix(kVar.q0);
                            if (kVar.r0 == null) {
                                Paint paint = new Paint(3);
                                kVar.r0 = paint;
                                paint.setColor(-1);
                            }
                            kVar.r0.setShader(kVar.p0);
                            break;
                        } else {
                            kVar.o0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}

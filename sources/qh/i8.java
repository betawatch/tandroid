package qh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.wo;
import org.telegram.ui.lc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ i8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z4 = false;
        ca caVar = this.b;
        switch (i10) {
            case 0:
                ca caVar2 = this.b;
                if (caVar2.H1 != null && caVar2.z2 == null && caVar2.f1 != null) {
                    ValueAnimator valueAnimator = caVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z10 = caVar2.H1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(caVar2.n.getWidth(), caVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        caVar2.f1.setAlpha(0.0f);
                        q9 q9Var = caVar2.U0;
                        if (q9Var != null) {
                            q9Var.d0 = true;
                        }
                        f9 f9Var = caVar2.s1;
                        if (f9Var != null) {
                            f9Var.F0 = true;
                        }
                        caVar2.n.draw(canvas);
                        q9 q9Var2 = caVar2.U0;
                        if (q9Var2 != null) {
                            q9Var2.d0 = false;
                        }
                        f9 f9Var2 = caVar2.s1;
                        if (f9Var2 != null) {
                            f9Var2.F0 = false;
                        }
                        caVar2.f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        caVar2.f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wo woVar = new wo(caVar2, caVar2.b, z10, canvas, (caVar2.f1.getMeasuredWidth() / 2.0f) + f10, (caVar2.f1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
                        caVar2.z2 = woVar;
                        woVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        caVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        caVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new lc(caVar2, 3));
                        caVar2.B2.addListener(new b9(caVar2, 2));
                        caVar2.B2.setStartDelay(80L);
                        caVar2.B2.setDuration(z10 ? 320L : 450L);
                        caVar2.B2.setInterpolator(z10 ? pr.i : pr.h);
                        caVar2.B2.start();
                        caVar2.n.addView(caVar2.z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g8(caVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!caVar.P1) {
                    caVar.M();
                    break;
                }
                break;
            case 2:
                s6 s6Var = caVar.H1;
                if (s6Var != null && !caVar.P1) {
                    s6Var.Y = !s6Var.Y;
                    ArrayList arrayList = s6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((s6) obj).Y = caVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(caVar.H1.y);
                    s6 s6Var2 = caVar.H1;
                    boolean z11 = s6Var2.o0 != null;
                    if (caVar.d0 == -1) {
                        f3 f3Var = caVar.h1;
                        if (s6Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z12 = caVar.h1.S;
                        if (f3Var.getMeasuredWidth() < 0) {
                            f3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = f3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z4 = true;
                            }
                            j6Var.q(string, z4, true);
                        }
                        caVar.h1.v();
                    }
                    caVar.f0(caVar.H1.Y, true);
                    caVar.U0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = caVar.U0.k();
                caVar.U0.x(-9982, k10);
                ((og0) caVar.g1.c).a(!k10, true);
                break;
            case 4:
                if (caVar.y0 != null && !caVar.P1) {
                    String C = caVar.C();
                    String F = caVar.F();
                    if (C != null && !C.equals(F)) {
                        g9 g9Var = caVar.y0;
                        if (g9Var != null && g9Var.getCameraSession() != null) {
                            if (!caVar.y0.isFrontface() || caVar.y0.getCameraSession().hasFlashModes()) {
                                caVar.y0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = caVar.r2.indexOf(F);
                                if (indexOf >= 0) {
                                    caVar.q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", caVar.q2).apply();
                                }
                            }
                        }
                        caVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                g9 g9Var2 = caVar.y0;
                if (g9Var2 != null && caVar.c0 == 0) {
                    g9Var2.toggleDual();
                    caVar.C0.setValue(caVar.y0.isDual());
                    caVar.C0.setContentDescription(LocaleController.getString(caVar.y0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    caVar.i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (caVar.j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    caVar.j1.e(true);
                    break;
                }
                break;
            case 6:
                if (caVar.c0 == 0 && !caVar.X1) {
                    g9 g9Var3 = caVar.y0;
                    if (g9Var3 != null && g9Var3.isDual()) {
                        caVar.y0.toggleDual();
                    }
                    if (!caVar.F0.e && !caVar.x0.j()) {
                        caVar.x0.o(caVar.w0);
                        caVar.F0.setSelected(caVar.w0);
                        caVar.D0.a(new lc0(caVar.w0, false), true);
                        caVar.D0.setSelected(true);
                        g9 g9Var4 = caVar.y0;
                        if (g9Var4 != null) {
                            g9Var4.recordHevc = !caVar.x0.j();
                        }
                        c9 c9Var = caVar.J0;
                        if (c9Var != null) {
                            c9Var.setMultipleOnClick(caVar.x0.j());
                            caVar.J0.setMaxCount(Math.min(10, r.b() - caVar.x0.getFilledCount()));
                        }
                    }
                    caVar.F0.a(!r1.e, true);
                    caVar.m0(true);
                    break;
                }
                break;
            case 7:
                caVar.x0.o(null);
                caVar.x0.e();
                caVar.F0.setSelected((r) null);
                g9 g9Var5 = caVar.y0;
                if (g9Var5 != null) {
                    g9Var5.recordHevc = !caVar.x0.j();
                }
                caVar.F0.a(false, true);
                caVar.m0(true);
                c9 c9Var2 = caVar.J0;
                if (c9Var2 != null) {
                    c9Var2.setMultipleOnClick(caVar.x0.j());
                    caVar.J0.setMaxCount(Math.min(10, r.b() - caVar.x0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                caVar.k0();
                break;
            case 9:
                g9 g9Var6 = caVar.y0;
                if (g9Var6 != null && !caVar.P1 && !caVar.M1 && g9Var6.isInited() && caVar.c0 == 0) {
                    caVar.y0.switchCamera();
                    caVar.L0.d(180.0f);
                    ca.a0(caVar.y0.isFrontface());
                    if (!caVar.q0()) {
                        caVar.s.d();
                        break;
                    } else {
                        caVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                caVar.k0();
                break;
            case 11:
                s6 s6Var3 = caVar.H1;
                if (s6Var3 != null) {
                    s6Var3.f0 = true;
                    s6Var3.e0 = caVar.J1;
                    caVar.X();
                    s6 s6Var4 = caVar.H1;
                    if (s6Var4 != null && !s6Var4.b0) {
                        AndroidUtilities.runOnUIThread(new g8(caVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (caVar.p2) {
                    caVar.Z(true);
                    break;
                }
                break;
            case 13:
                caVar.l0(-1, false, true);
                break;
            default:
                caVar.l0(-1, false, true);
                break;
        }
    }
}

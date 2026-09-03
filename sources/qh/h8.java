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
import org.telegram.ui.kc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ h8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z4 = false;
        ba baVar = this.b;
        switch (i10) {
            case 0:
                ba baVar2 = this.b;
                if (baVar2.H1 != null && baVar2.z2 == null && baVar2.f1 != null) {
                    ValueAnimator valueAnimator = baVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z10 = baVar2.H1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(baVar2.n.getWidth(), baVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        baVar2.f1.setAlpha(0.0f);
                        p9 p9Var = baVar2.U0;
                        if (p9Var != null) {
                            p9Var.d0 = true;
                        }
                        e9 e9Var = baVar2.s1;
                        if (e9Var != null) {
                            e9Var.F0 = true;
                        }
                        baVar2.n.draw(canvas);
                        p9 p9Var2 = baVar2.U0;
                        if (p9Var2 != null) {
                            p9Var2.d0 = false;
                        }
                        e9 e9Var2 = baVar2.s1;
                        if (e9Var2 != null) {
                            e9Var2.F0 = false;
                        }
                        baVar2.f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        baVar2.f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wo woVar = new wo(baVar2, baVar2.b, z10, canvas, (baVar2.f1.getMeasuredWidth() / 2.0f) + f10, (baVar2.f1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
                        baVar2.z2 = woVar;
                        woVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        baVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        baVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new kc(baVar2, 3));
                        baVar2.B2.addListener(new a9(baVar2, 2));
                        baVar2.B2.setStartDelay(80L);
                        baVar2.B2.setDuration(z10 ? 320L : 450L);
                        baVar2.B2.setInterpolator(z10 ? pr.i : pr.h);
                        baVar2.B2.start();
                        baVar2.n.addView(baVar2.z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new f8(baVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!baVar.P1) {
                    baVar.M();
                    break;
                }
                break;
            case 2:
                r6 r6Var = baVar.H1;
                if (r6Var != null && !baVar.P1) {
                    r6Var.Y = !r6Var.Y;
                    ArrayList arrayList = r6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((r6) obj).Y = baVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(baVar.H1.y);
                    r6 r6Var2 = baVar.H1;
                    boolean z11 = r6Var2.o0 != null;
                    if (baVar.d0 == -1) {
                        e3 e3Var = baVar.h1;
                        if (r6Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z12 = baVar.h1.S;
                        if (e3Var.getMeasuredWidth() < 0) {
                            e3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = e3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z4 = true;
                            }
                            j6Var.q(string, z4, true);
                        }
                        baVar.h1.u();
                    }
                    baVar.f0(baVar.H1.Y, true);
                    baVar.U0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = baVar.U0.k();
                baVar.U0.x(-9982, k10);
                ((og0) baVar.g1.c).a(!k10, true);
                break;
            case 4:
                if (baVar.y0 != null && !baVar.P1) {
                    String C = baVar.C();
                    String F = baVar.F();
                    if (C != null && !C.equals(F)) {
                        f9 f9Var = baVar.y0;
                        if (f9Var != null && f9Var.getCameraSession() != null) {
                            if (!baVar.y0.isFrontface() || baVar.y0.getCameraSession().hasFlashModes()) {
                                baVar.y0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = baVar.r2.indexOf(F);
                                if (indexOf >= 0) {
                                    baVar.q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", baVar.q2).apply();
                                }
                            }
                        }
                        baVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                f9 f9Var2 = baVar.y0;
                if (f9Var2 != null && baVar.c0 == 0) {
                    f9Var2.toggleDual();
                    baVar.C0.setValue(baVar.y0.isDual());
                    baVar.C0.setContentDescription(LocaleController.getString(baVar.y0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    baVar.i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (baVar.j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    baVar.j1.e(true);
                    break;
                }
                break;
            case 6:
                if (baVar.c0 == 0 && !baVar.X1) {
                    f9 f9Var3 = baVar.y0;
                    if (f9Var3 != null && f9Var3.isDual()) {
                        baVar.y0.toggleDual();
                    }
                    if (!baVar.F0.e && !baVar.x0.j()) {
                        baVar.x0.o(baVar.w0);
                        baVar.F0.setSelected(baVar.w0);
                        baVar.D0.a(new lc0(baVar.w0, false), true);
                        baVar.D0.setSelected(true);
                        f9 f9Var4 = baVar.y0;
                        if (f9Var4 != null) {
                            f9Var4.recordHevc = !baVar.x0.j();
                        }
                        b9 b9Var = baVar.J0;
                        if (b9Var != null) {
                            b9Var.setMultipleOnClick(baVar.x0.j());
                            baVar.J0.setMaxCount(Math.min(10, r.b() - baVar.x0.getFilledCount()));
                        }
                    }
                    baVar.F0.a(!r1.e, true);
                    baVar.m0(true);
                    break;
                }
                break;
            case 7:
                baVar.x0.o(null);
                baVar.x0.e();
                baVar.F0.setSelected((r) null);
                f9 f9Var5 = baVar.y0;
                if (f9Var5 != null) {
                    f9Var5.recordHevc = !baVar.x0.j();
                }
                baVar.F0.a(false, true);
                baVar.m0(true);
                b9 b9Var2 = baVar.J0;
                if (b9Var2 != null) {
                    b9Var2.setMultipleOnClick(baVar.x0.j());
                    baVar.J0.setMaxCount(Math.min(10, r.b() - baVar.x0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                baVar.k0();
                break;
            case 9:
                f9 f9Var6 = baVar.y0;
                if (f9Var6 != null && !baVar.P1 && !baVar.M1 && f9Var6.isInited() && baVar.c0 == 0) {
                    baVar.y0.switchCamera();
                    baVar.L0.d(180.0f);
                    ba.a0(baVar.y0.isFrontface());
                    if (!baVar.q0()) {
                        baVar.s.d();
                        break;
                    } else {
                        baVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                baVar.k0();
                break;
            case 11:
                r6 r6Var3 = baVar.H1;
                if (r6Var3 != null) {
                    r6Var3.f0 = true;
                    r6Var3.e0 = baVar.J1;
                    baVar.X();
                    r6 r6Var4 = baVar.H1;
                    if (r6Var4 != null && !r6Var4.b0) {
                        AndroidUtilities.runOnUIThread(new f8(baVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (baVar.p2) {
                    baVar.Z(true);
                    break;
                }
                break;
            case 13:
                baVar.l0(-1, false, true);
                break;
            default:
                baVar.l0(-1, false, true);
                break;
        }
    }
}

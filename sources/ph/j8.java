package ph;

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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.to;
import org.telegram.ui.nc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ j8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z4 = false;
        da daVar = this.b;
        switch (i10) {
            case 0:
                da daVar2 = this.b;
                if (daVar2.H1 != null && daVar2.z2 == null && daVar2.f1 != null) {
                    ValueAnimator valueAnimator = daVar2.B2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z10 = daVar2.H1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(daVar2.n.getWidth(), daVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        daVar2.f1.setAlpha(0.0f);
                        s9 s9Var = daVar2.U0;
                        if (s9Var != null) {
                            s9Var.d0 = true;
                        }
                        h9 h9Var = daVar2.s1;
                        if (h9Var != null) {
                            h9Var.F0 = true;
                        }
                        daVar2.n.draw(canvas);
                        s9 s9Var2 = daVar2.U0;
                        if (s9Var2 != null) {
                            s9Var2.d0 = false;
                        }
                        h9 h9Var2 = daVar2.s1;
                        if (h9Var2 != null) {
                            h9Var2.F0 = false;
                        }
                        daVar2.f1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        daVar2.f1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        to toVar = new to(daVar2, daVar2.b, z10, canvas, (daVar2.f1.getMeasuredWidth() / 2.0f) + f10, (daVar2.f1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
                        daVar2.z2 = toVar;
                        toVar.setOnTouchListener(new oh.d(2));
                        daVar2.A2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        daVar2.B2 = ofFloat;
                        ofFloat.addUpdateListener(new nc(daVar2, 3));
                        daVar2.B2.addListener(new d9(daVar2, 2));
                        daVar2.B2.setStartDelay(80L);
                        daVar2.B2.setDuration(z10 ? 320L : 450L);
                        daVar2.B2.setInterpolator(z10 ? mr.i : mr.h);
                        daVar2.B2.start();
                        daVar2.n.addView(daVar2.z2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g8(daVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!daVar.P1) {
                    daVar.M();
                    break;
                }
                break;
            case 2:
                t6 t6Var = daVar.H1;
                if (t6Var != null && !daVar.P1) {
                    t6Var.Y = !t6Var.Y;
                    ArrayList arrayList = t6Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((t6) obj).Y = daVar.H1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(daVar.H1.y);
                    t6 t6Var2 = daVar.H1;
                    boolean z11 = t6Var2.o0 != null;
                    if (daVar.d0 == -1) {
                        f3 f3Var = daVar.h1;
                        if (t6Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z11) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z12 = daVar.h1.S;
                        if (f3Var.getMeasuredWidth() < 0) {
                            f3Var.D = string;
                        } else {
                            org.telegram.ui.Components.j6 j6Var = f3Var.E;
                            if (!LocaleController.isRTL && z12) {
                                z4 = true;
                            }
                            j6Var.q(string, z4, true);
                        }
                        daVar.h1.u();
                    }
                    daVar.f0(daVar.H1.Y, true);
                    daVar.U0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = daVar.U0.k();
                daVar.U0.x(-9982, k10);
                ((ng0) daVar.g1.c).a(!k10, true);
                break;
            case 4:
                if (daVar.y0 != null && !daVar.P1) {
                    String C = daVar.C();
                    String F = daVar.F();
                    if (C != null && !C.equals(F)) {
                        i9 i9Var = daVar.y0;
                        if (i9Var != null && i9Var.getCameraSession() != null) {
                            if (!daVar.y0.isFrontface() || daVar.y0.getCameraSession().hasFlashModes()) {
                                daVar.y0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = daVar.r2.indexOf(F);
                                if (indexOf >= 0) {
                                    daVar.q2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", daVar.q2).apply();
                                }
                            }
                        }
                        daVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                i9 i9Var2 = daVar.y0;
                if (i9Var2 != null && daVar.c0 == 0) {
                    i9Var2.toggleDual();
                    daVar.C0.setValue(daVar.y0.isDual());
                    daVar.C0.setContentDescription(LocaleController.getString(daVar.y0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    daVar.i1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (daVar.j1.S) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    daVar.j1.e(true);
                    break;
                }
                break;
            case 6:
                if (daVar.c0 == 0 && !daVar.X1) {
                    i9 i9Var3 = daVar.y0;
                    if (i9Var3 != null && i9Var3.isDual()) {
                        daVar.y0.toggleDual();
                    }
                    if (!daVar.F0.e && !daVar.x0.j()) {
                        daVar.x0.o(daVar.w0);
                        daVar.F0.setSelected(daVar.w0);
                        daVar.D0.a(new kc0(daVar.w0, false), true);
                        daVar.D0.setSelected(true);
                        i9 i9Var4 = daVar.y0;
                        if (i9Var4 != null) {
                            i9Var4.recordHevc = !daVar.x0.j();
                        }
                        e9 e9Var = daVar.J0;
                        if (e9Var != null) {
                            e9Var.setMultipleOnClick(daVar.x0.j());
                            daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.x0.getFilledCount()));
                        }
                    }
                    daVar.F0.a(!r1.e, true);
                    daVar.m0(true);
                    break;
                }
                break;
            case 7:
                daVar.x0.o(null);
                daVar.x0.e();
                daVar.F0.setSelected((r) null);
                i9 i9Var5 = daVar.y0;
                if (i9Var5 != null) {
                    i9Var5.recordHevc = !daVar.x0.j();
                }
                daVar.F0.a(false, true);
                daVar.m0(true);
                e9 e9Var2 = daVar.J0;
                if (e9Var2 != null) {
                    e9Var2.setMultipleOnClick(daVar.x0.j());
                    daVar.J0.setMaxCount(Math.min(10, r.b() - daVar.x0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                daVar.k0();
                break;
            case 9:
                i9 i9Var6 = daVar.y0;
                if (i9Var6 != null && !daVar.P1 && !daVar.M1 && i9Var6.isInited() && daVar.c0 == 0) {
                    daVar.y0.switchCamera();
                    daVar.L0.d(180.0f);
                    da.a0(daVar.y0.isFrontface());
                    if (!daVar.q0()) {
                        daVar.s.d();
                        break;
                    } else {
                        daVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                daVar.k0();
                break;
            case 11:
                t6 t6Var3 = daVar.H1;
                if (t6Var3 != null) {
                    t6Var3.f0 = true;
                    t6Var3.e0 = daVar.J1;
                    daVar.X();
                    t6 t6Var4 = daVar.H1;
                    if (t6Var4 != null && !t6Var4.b0) {
                        AndroidUtilities.runOnUIThread(new g8(daVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (daVar.p2) {
                    daVar.Z(true);
                    break;
                }
                break;
            case 13:
                daVar.l0(-1, false, true);
                break;
            default:
                daVar.l0(-1, false, true);
                break;
        }
    }
}

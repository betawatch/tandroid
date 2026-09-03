package qh;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ f8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c3;
        ArrayList arrayList;
        p9 p9Var;
        aa aaVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        ba baVar = this.b;
        switch (i11) {
            case 0:
                baVar.r();
                break;
            case 1:
                if (baVar.q2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", baVar.s.o).putFloat("frontflash_intensity", baVar.s.p).apply();
                }
                baVar.s.e(0.0f, 240L, null);
                baVar.B0.setSelected(false);
                break;
            case 2:
                baVar.m();
                baVar.T1 = false;
                int i14 = baVar.c;
                if (baVar.H1 == null) {
                    baVar.q(true);
                    break;
                } else {
                    baVar.y();
                    g8 g8Var = new g8(baVar, i12);
                    if (baVar.E1 == null) {
                        r6 r6Var = baVar.H1;
                        if (r6Var.K && !r6Var.v() && !r6Var.g) {
                            long j10 = r6Var.h0;
                            if (j10 > 0 && !r6Var.n) {
                                long j11 = (long) ((r6Var.a0 - r6Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c3 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    r6Var.a0 = (59000.0f / r6Var.h0) + r6Var.Z;
                                    arrayList.add(r6Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c3 = 0;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                r6 g10 = r6Var.g();
                                                float f10 = r6Var.Z;
                                                float f11 = r6Var.h0;
                                                g10.Z = (j13 / f11) + f10;
                                                g10.a0 = ((r9 + j13) / f11) + r6Var.Z;
                                                g10.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g10);
                                                j12 = j14;
                                                i14 = i14;
                                            }
                                        }
                                    }
                                    i10 = i14;
                                }
                                baVar.E1 = arrayList;
                                if (arrayList != null) {
                                    baVar.F1 = new ArrayList();
                                    baVar.G1 = new ArrayList();
                                    for (int i15 = 0; i15 < baVar.E1.size(); i15 = yh.d(i15, i15, 1, baVar.G1)) {
                                        baVar.F1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i10 = i14;
                        c3 = 0;
                        arrayList = null;
                        baVar.E1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i14;
                        c3 = 0;
                    }
                    if (baVar.E1 != null) {
                        ArrayList arrayList2 = baVar.G1;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (baVar.F1.contains(num)) {
                                r6 r6Var2 = (r6) baVar.E1.get(num.intValue());
                                r6 r6Var3 = baVar.H1;
                                if (r6Var3 == r6Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c3] = baVar.Z0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c3] = baVar.H1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    r6 r6Var4 = baVar.H1;
                                    r6Var4.k = (TextUtils.equals(r6Var4.C0, charSequenceArr[c3]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    baVar.H1.C0 = new SpannableString(baVar.Z0.getText());
                                } else if (r6Var2.C0 == null) {
                                    r6Var3.k = false;
                                    r6Var3.C0 = new SpannableString("");
                                }
                                g8Var.run(r6Var2);
                                c3 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {baVar.Z0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{baVar.H1.C0}, true) : new ArrayList<>();
                        r6 r6Var5 = baVar.H1;
                        r6Var5.k = (TextUtils.equals(r6Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        baVar.H1.C0 = new SpannableString(baVar.Z0.getText());
                        g8Var.run(baVar.H1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = baVar.H1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    baVar.H1 = null;
                    baVar.v = true;
                    baVar.w = j15;
                    baVar.y2 = true;
                    baVar.o();
                    hg.y1 y1Var = new hg.y1(baVar, j15, 26);
                    r9 r9Var = baVar.x;
                    if (r9Var != null) {
                        r9Var.b(j15, y1Var);
                    } else {
                        y1Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                baVar.Z(false);
                break;
            case 4:
                r6 r6Var6 = baVar.H1;
                if (r6Var6 != null) {
                    r6Var6.y0 = !r6Var6.y0;
                    p9 p9Var2 = baVar.U0;
                    if (p9Var2 != null) {
                        p9Var2.u(r6Var6);
                    }
                    e9 e9Var = baVar.s1;
                    if (e9Var != null && e9Var.O0 != null) {
                        while (r9 < baVar.s1.O0.getChildCount()) {
                            View childAt = baVar.s1.O0.getChildAt(r9);
                            if (childAt instanceof eg.y1) {
                                ((eg.y1) childAt).setupTheme(baVar.H1);
                            }
                            r9++;
                        }
                    }
                    baVar.o0(true);
                    break;
                }
                break;
            case 5:
                baVar.q(true);
                break;
            case 6:
                baVar.d = true;
                baVar.v = false;
                if (baVar.G == 1) {
                    baVar.e0.setAlpha(1.0f);
                    baVar.e0.setTranslationX(0.0f);
                    baVar.e0.setTranslationY(0.0f);
                    baVar.f0.setAlpha(1.0f);
                    baVar.h0.setAlpha(1.0f);
                    baVar.n.setBackgroundColor(-16777216);
                    if (baVar.c0 == 2) {
                        baVar.r1.setAlpha(1.0f);
                    }
                }
                f8 f8Var = baVar.u2;
                if (f8Var != null) {
                    f8Var.run();
                    baVar.u2 = null;
                } else {
                    baVar.P();
                }
                r6 r6Var7 = baVar.H1;
                if (r6Var7 != null && r6Var7.n) {
                    baVar.u();
                    baVar.H();
                    baVar.s();
                    break;
                } else if (r6Var7 != null && r6Var7.u) {
                    if (r6Var7.K) {
                        baVar.U0.t(r6Var7, null, 0L);
                    }
                    baVar.s();
                    break;
                }
                break;
            case 7:
                baVar.g(1.0f, true, new f8(baVar, 6));
                break;
            case 8:
                baVar.x0.setCameraThumb(baVar.A());
                f9 f9Var = baVar.y0;
                if (f9Var != null) {
                    f9Var.destroy(true, null);
                    AndroidUtilities.removeFromParent(baVar.y0);
                    o9 o9Var = baVar.x0;
                    if (o9Var != null) {
                        o9Var.setCameraView(null);
                    }
                    baVar.y0 = null;
                    break;
                }
                break;
            case 9:
                baVar.x0.setCameraThumb(baVar.A());
                break;
            case 10:
                if (baVar.c0 == 1) {
                    baVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                t8 t8Var = baVar.a1;
                if (t8Var != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + baVar.Z0.getEditTextHeight());
                    t8Var.setTranslationY(i17 - (baVar.W0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                o9 o9Var2 = baVar.x0;
                if (o9Var2 != null) {
                    o9Var2.c.a(baVar.A0.y ? baVar.z0.d : null);
                    break;
                }
                break;
            case 13:
                baVar.m0(true);
                break;
            case 14:
                baVar.s();
                break;
            case 15:
                q9 q9Var = baVar.Z0;
                if (q9Var != null) {
                    q9Var.m();
                    break;
                }
                break;
            case 16:
                if (baVar.d0 == -1 && baVar.c0 == 1) {
                    q9 q9Var2 = baVar.Z0;
                    if (!q9Var2.m0 && !q9Var2.L1) {
                        la laVar = baVar.W0;
                        if (!laVar.M) {
                            t8 t8Var2 = baVar.a1;
                            if (t8Var2.J) {
                                t8Var2.c(false, true);
                                break;
                            } else {
                                baVar.l0(0, false, true);
                                e9 e9Var2 = baVar.s1;
                                if (e9Var2 != null) {
                                    e9Var2.R0(2);
                                    e9Var2.i2 = true;
                                    e9Var2.o0(true);
                                    baVar.s1.J0 = true;
                                    break;
                                }
                            }
                        } else {
                            laVar.M = false;
                            if (laVar.B && laVar.h == null) {
                                laVar.D = true;
                                fa faVar = laVar.a;
                                if (faVar != null) {
                                    faVar.j0(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                baVar.K1 = true;
                baVar.Y0.setShareEnabled(false);
                n0 n0Var = baVar.b1;
                n0Var.getClass();
                n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                baVar.x0.setCameraThumb(baVar.A());
                break;
            case 19:
                aa aaVar2 = baVar.n;
                oh.b bVar = baVar.a;
                new qc(aaVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.k6.gc, 0, new f8(baVar, 27), bVar)).k(true);
                break;
            case 20:
                c8 c8Var = baVar.n0;
                if (c8Var != null) {
                    c8Var.dismiss();
                }
                baVar.K(2, true);
                break;
            case 21:
                baVar.l0(-1, false, true);
                break;
            case 22:
                baVar.l0(-1, false, true);
                break;
            case 23:
                baVar.d = false;
                AndroidUtilities.unlockOrientation(baVar.b);
                if (baVar.y0 != null) {
                    if (baVar.N1) {
                        CameraController.getInstance().stopVideoRecording(baVar.y0.getCameraSession(), false);
                    }
                    baVar.v(false);
                }
                p9 p9Var3 = baVar.U0;
                if (p9Var3 != null) {
                    p9Var3.set(null);
                }
                baVar.z();
                baVar.y();
                File file = baVar.D1;
                if (file != null && !baVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                baVar.D1 = null;
                AndroidUtilities.runOnUIThread(new f8(baVar, 28), 16L);
                w9 w9Var = baVar.C;
                if (w9Var != null) {
                    w9Var.f(false);
                }
                if (baVar.u2 != null) {
                    baVar.u2 = null;
                }
                baVar.i2 = null;
                ba baVar2 = ba.C2;
                if (baVar2 != null) {
                    baVar2.q(false);
                }
                ba.C2 = null;
                aa aaVar3 = baVar.n;
                if (aaVar3 != null) {
                    ic.h(aaVar3);
                }
                n9 n9Var = baVar.i0;
                if (n9Var != null) {
                    ic.h(n9Var);
                }
                o9 o9Var3 = baVar.x0;
                if (o9Var3 != null) {
                    o9Var3.e();
                    break;
                }
                break;
            case 24:
                if (!baVar.H1.b0 && baVar.n0 != null && (p9Var = baVar.U0) != null) {
                    p9Var.h(new g8(baVar, i13), p9Var, baVar.t1, baVar.w1);
                }
                baVar.K(1, true);
                break;
            case 25:
                baVar.j0(false);
                baVar.b2 = null;
                break;
            case 26:
                baVar.j0(false);
                baVar.b2 = null;
                break;
            case 27:
                baVar.T();
                break;
            default:
                WindowManager windowManager = baVar.f;
                if (windowManager != null && (aaVar = baVar.n) != null && aaVar.getParent() != null) {
                    windowManager.removeView(baVar.n);
                    break;
                }
                break;
        }
    }
}

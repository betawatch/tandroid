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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ g8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
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
        q9 q9Var;
        ba baVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        ca caVar = this.b;
        switch (i11) {
            case 0:
                caVar.r();
                break;
            case 1:
                if (caVar.q2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", caVar.s.o).putFloat("frontflash_intensity", caVar.s.p).apply();
                }
                caVar.s.e(0.0f, 240L, null);
                caVar.B0.setSelected(false);
                break;
            case 2:
                caVar.m();
                caVar.T1 = false;
                int i14 = caVar.c;
                if (caVar.H1 == null) {
                    caVar.q(true);
                    break;
                } else {
                    caVar.y();
                    h8 h8Var = new h8(caVar, i12);
                    if (caVar.E1 == null) {
                        s6 s6Var = caVar.H1;
                        if (s6Var.K && !s6Var.v() && !s6Var.g) {
                            long j10 = s6Var.h0;
                            if (j10 > 0 && !s6Var.n) {
                                long j11 = (long) ((s6Var.a0 - s6Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i14;
                                    arrayList = null;
                                    c3 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    s6Var.a0 = (59000.0f / s6Var.h0) + s6Var.Z;
                                    arrayList.add(s6Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        c3 = 0;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                s6 g10 = s6Var.g();
                                                float f10 = s6Var.Z;
                                                float f11 = s6Var.h0;
                                                g10.Z = (j13 / f11) + f10;
                                                g10.a0 = ((r9 + j13) / f11) + s6Var.Z;
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
                                caVar.E1 = arrayList;
                                if (arrayList != null) {
                                    caVar.F1 = new ArrayList();
                                    caVar.G1 = new ArrayList();
                                    for (int i15 = 0; i15 < caVar.E1.size(); i15 = yh.d(i15, i15, 1, caVar.G1)) {
                                        caVar.F1.add(Integer.valueOf(i15));
                                    }
                                }
                            }
                        }
                        i10 = i14;
                        c3 = 0;
                        arrayList = null;
                        caVar.E1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i14;
                        c3 = 0;
                    }
                    if (caVar.E1 != null) {
                        ArrayList arrayList2 = caVar.G1;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            if (caVar.F1.contains(num)) {
                                s6 s6Var2 = (s6) caVar.E1.get(num.intValue());
                                s6 s6Var3 = caVar.H1;
                                if (s6Var3 == s6Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c3] = caVar.Z0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c3] = caVar.H1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    s6 s6Var4 = caVar.H1;
                                    s6Var4.k = (TextUtils.equals(s6Var4.C0, charSequenceArr[c3]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    caVar.H1.C0 = new SpannableString(caVar.Z0.getText());
                                } else if (s6Var2.C0 == null) {
                                    s6Var3.k = false;
                                    s6Var3.C0 = new SpannableString("");
                                }
                                h8Var.run(s6Var2);
                                c3 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {caVar.Z0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{caVar.H1.C0}, true) : new ArrayList<>();
                        s6 s6Var5 = caVar.H1;
                        s6Var5.k = (TextUtils.equals(s6Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        caVar.H1.C0 = new SpannableString(caVar.Z0.getText());
                        h8Var.run(caVar.H1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = caVar.H1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    caVar.H1 = null;
                    caVar.v = true;
                    caVar.w = j15;
                    caVar.y2 = true;
                    caVar.o();
                    hg.y1 y1Var = new hg.y1(caVar, j15, 26);
                    s9 s9Var = caVar.x;
                    if (s9Var != null) {
                        s9Var.b(j15, y1Var);
                    } else {
                        y1Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                caVar.Z(false);
                break;
            case 4:
                s6 s6Var6 = caVar.H1;
                if (s6Var6 != null) {
                    s6Var6.y0 = !s6Var6.y0;
                    q9 q9Var2 = caVar.U0;
                    if (q9Var2 != null) {
                        q9Var2.u(s6Var6);
                    }
                    f9 f9Var = caVar.s1;
                    if (f9Var != null && f9Var.O0 != null) {
                        while (r9 < caVar.s1.O0.getChildCount()) {
                            View childAt = caVar.s1.O0.getChildAt(r9);
                            if (childAt instanceof eg.y1) {
                                ((eg.y1) childAt).setupTheme(caVar.H1);
                            }
                            r9++;
                        }
                    }
                    caVar.o0(true);
                    break;
                }
                break;
            case 5:
                caVar.q(true);
                break;
            case 6:
                caVar.d = true;
                caVar.v = false;
                if (caVar.G == 1) {
                    caVar.e0.setAlpha(1.0f);
                    caVar.e0.setTranslationX(0.0f);
                    caVar.e0.setTranslationY(0.0f);
                    caVar.f0.setAlpha(1.0f);
                    caVar.h0.setAlpha(1.0f);
                    caVar.n.setBackgroundColor(-16777216);
                    if (caVar.c0 == 2) {
                        caVar.r1.setAlpha(1.0f);
                    }
                }
                g8 g8Var = caVar.u2;
                if (g8Var != null) {
                    g8Var.run();
                    caVar.u2 = null;
                } else {
                    caVar.P();
                }
                s6 s6Var7 = caVar.H1;
                if (s6Var7 != null && s6Var7.n) {
                    caVar.u();
                    caVar.H();
                    caVar.s();
                    break;
                } else if (s6Var7 != null && s6Var7.u) {
                    if (s6Var7.K) {
                        caVar.U0.t(s6Var7, null, 0L);
                    }
                    caVar.s();
                    break;
                }
                break;
            case 7:
                caVar.g(1.0f, true, new g8(caVar, 6));
                break;
            case 8:
                caVar.x0.setCameraThumb(caVar.A());
                g9 g9Var = caVar.y0;
                if (g9Var != null) {
                    g9Var.destroy(true, null);
                    AndroidUtilities.removeFromParent(caVar.y0);
                    p9 p9Var = caVar.x0;
                    if (p9Var != null) {
                        p9Var.setCameraView(null);
                    }
                    caVar.y0 = null;
                    break;
                }
                break;
            case 9:
                caVar.x0.setCameraThumb(caVar.A());
                break;
            case 10:
                if (caVar.c0 == 1) {
                    caVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                u8 u8Var = caVar.a1;
                if (u8Var != null) {
                    int i17 = -(AndroidUtilities.dp(24.0f) + caVar.Z0.getEditTextHeight());
                    u8Var.setTranslationY(i17 - (caVar.W0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                p9 p9Var2 = caVar.x0;
                if (p9Var2 != null) {
                    p9Var2.c.a(caVar.A0.y ? caVar.z0.d : null);
                    break;
                }
                break;
            case 13:
                caVar.m0(true);
                break;
            case 14:
                caVar.s();
                break;
            case 15:
                r9 r9Var = caVar.Z0;
                if (r9Var != null) {
                    r9Var.m();
                    break;
                }
                break;
            case 16:
                if (caVar.d0 == -1 && caVar.c0 == 1) {
                    r9 r9Var2 = caVar.Z0;
                    if (!r9Var2.m0 && !r9Var2.L1) {
                        ma maVar = caVar.W0;
                        if (!maVar.M) {
                            u8 u8Var2 = caVar.a1;
                            if (u8Var2.J) {
                                u8Var2.c(false, true);
                                break;
                            } else {
                                caVar.l0(0, false, true);
                                f9 f9Var2 = caVar.s1;
                                if (f9Var2 != null) {
                                    f9Var2.R0(2);
                                    f9Var2.i2 = true;
                                    f9Var2.o0(true);
                                    caVar.s1.J0 = true;
                                    break;
                                }
                            }
                        } else {
                            maVar.M = false;
                            if (maVar.B && maVar.h == null) {
                                maVar.D = true;
                                ga gaVar = maVar.a;
                                if (gaVar != null) {
                                    gaVar.j0(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                caVar.K1 = true;
                caVar.Y0.setShareEnabled(false);
                n0 n0Var = caVar.b1;
                n0Var.getClass();
                n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                caVar.x0.setCameraThumb(caVar.A());
                break;
            case 19:
                ba baVar2 = caVar.n;
                oh.b bVar = caVar.a;
                new qc(baVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.k6.gc, 0, new g8(caVar, 27), bVar)).k(true);
                break;
            case 20:
                d8 d8Var = caVar.n0;
                if (d8Var != null) {
                    d8Var.dismiss();
                }
                caVar.K(2, true);
                break;
            case 21:
                caVar.l0(-1, false, true);
                break;
            case 22:
                caVar.l0(-1, false, true);
                break;
            case 23:
                caVar.d = false;
                AndroidUtilities.unlockOrientation(caVar.b);
                if (caVar.y0 != null) {
                    if (caVar.N1) {
                        CameraController.getInstance().stopVideoRecording(caVar.y0.getCameraSession(), false);
                    }
                    caVar.v(false);
                }
                q9 q9Var3 = caVar.U0;
                if (q9Var3 != null) {
                    q9Var3.set(null);
                }
                caVar.z();
                caVar.y();
                File file = caVar.D1;
                if (file != null && !caVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                caVar.D1 = null;
                AndroidUtilities.runOnUIThread(new g8(caVar, 28), 16L);
                x9 x9Var = caVar.C;
                if (x9Var != null) {
                    x9Var.f(false);
                }
                if (caVar.u2 != null) {
                    caVar.u2 = null;
                }
                caVar.i2 = null;
                ca caVar2 = ca.C2;
                if (caVar2 != null) {
                    caVar2.q(false);
                }
                ca.C2 = null;
                ba baVar3 = caVar.n;
                if (baVar3 != null) {
                    ic.h(baVar3);
                }
                o9 o9Var = caVar.i0;
                if (o9Var != null) {
                    ic.h(o9Var);
                }
                p9 p9Var3 = caVar.x0;
                if (p9Var3 != null) {
                    p9Var3.e();
                    break;
                }
                break;
            case 24:
                if (!caVar.H1.b0 && caVar.n0 != null && (q9Var = caVar.U0) != null) {
                    q9Var.h(new h8(caVar, i13), q9Var, caVar.t1, caVar.w1);
                }
                caVar.K(1, true);
                break;
            case 25:
                caVar.j0(false);
                caVar.b2 = null;
                break;
            case 26:
                caVar.j0(false);
                caVar.b2 = null;
                break;
            case 27:
                caVar.T();
                break;
            default:
                WindowManager windowManager = caVar.f;
                if (windowManager != null && (baVar = caVar.n) != null && baVar.getParent() != null) {
                    windowManager.removeView(caVar.n);
                    break;
                }
                break;
        }
    }
}

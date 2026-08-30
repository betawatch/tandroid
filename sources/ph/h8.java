package ph;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ h8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
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
        s9 s9Var;
        ca caVar;
        int i11 = this.a;
        int i12 = 27;
        int i13 = 2;
        int i14 = 1;
        da daVar = this.b;
        switch (i11) {
            case 0:
                daVar.r();
                break;
            case 1:
                if (daVar.q2 >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", daVar.s.o).putFloat("frontflash_intensity", daVar.s.p).apply();
                }
                daVar.s.e(0.0f, 240L, null);
                daVar.B0.setSelected(false);
                break;
            case 2:
                daVar.m();
                daVar.T1 = false;
                int i15 = daVar.c;
                if (daVar.H1 == null) {
                    daVar.q(true);
                    break;
                } else {
                    daVar.y();
                    i8 i8Var = new i8(daVar, i13);
                    if (daVar.E1 == null) {
                        u6 u6Var = daVar.H1;
                        if (u6Var.K && !u6Var.v() && !u6Var.g) {
                            long j10 = u6Var.h0;
                            if (j10 > 0 && !u6Var.n) {
                                long j11 = (long) ((u6Var.a0 - u6Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    c3 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    u6Var.a0 = (59000.0f / u6Var.h0) + u6Var.Z;
                                    arrayList.add(u6Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    c3 = 0;
                                    while (j13 < j11) {
                                        if (Math.min(j12, j11 - j13) < 1000) {
                                            i10 = i15;
                                        } else {
                                            long j14 = j12;
                                            u6 g10 = u6Var.g();
                                            float f10 = u6Var.Z;
                                            float f11 = u6Var.h0;
                                            g10.Z = (j13 / f11) + f10;
                                            g10.a0 = ((r14 + j13) / f11) + u6Var.Z;
                                            g10.C0 = "";
                                            j13 += j14;
                                            arrayList.add(g10);
                                            j12 = j14;
                                            i15 = i15;
                                        }
                                    }
                                    i10 = i15;
                                }
                                daVar.E1 = arrayList;
                                if (arrayList != null) {
                                    daVar.F1 = new ArrayList();
                                    daVar.G1 = new ArrayList();
                                    for (int i16 = 0; i16 < daVar.E1.size(); i16 = yh.e(i16, i16, 1, daVar.G1)) {
                                        daVar.F1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        c3 = 0;
                        arrayList = null;
                        daVar.E1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        c3 = 0;
                    }
                    if (daVar.E1 != null) {
                        ArrayList arrayList2 = daVar.G1;
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (daVar.F1.contains(num)) {
                                u6 u6Var2 = (u6) daVar.E1.get(num.intValue());
                                u6 u6Var3 = daVar.H1;
                                if (u6Var3 == u6Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c3] = daVar.Z0.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c3] = daVar.H1.C0;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    u6 u6Var4 = daVar.H1;
                                    u6Var4.k = (TextUtils.equals(u6Var4.C0, charSequenceArr[c3]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                                } else if (u6Var2.C0 == null) {
                                    u6Var3.k = false;
                                    u6Var3.C0 = new SpannableString("");
                                }
                                i8Var.run(u6Var2);
                                c3 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {daVar.Z0.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i10).storyEntitiesAllowed() ? MediaDataController.getInstance(i10).getEntities(new CharSequence[]{daVar.H1.C0}, true) : new ArrayList<>();
                        u6 u6Var5 = daVar.H1;
                        u6Var5.k = (TextUtils.equals(u6Var5.C0, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                        i8Var.run(daVar.H1);
                    }
                    long j15 = UserConfig.getInstance(i10).clientUserId;
                    TLRPC.InputPeer inputPeer = daVar.H1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = DialogObject.getPeerDialogId(inputPeer);
                    }
                    daVar.H1 = null;
                    daVar.v = true;
                    daVar.w = j15;
                    daVar.y2 = true;
                    daVar.o();
                    gg.y1 y1Var = new gg.y1(daVar, j15, 27);
                    u9 u9Var = daVar.x;
                    if (u9Var != null) {
                        u9Var.b(j15, y1Var);
                    } else {
                        y1Var.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                daVar.Z(false);
                break;
            case 4:
                u6 u6Var6 = daVar.H1;
                if (u6Var6 != null) {
                    u6Var6.y0 = !u6Var6.y0;
                    s9 s9Var2 = daVar.U0;
                    if (s9Var2 != null) {
                        s9Var2.u(u6Var6);
                    }
                    h9 h9Var = daVar.s1;
                    if (h9Var != null && h9Var.O0 != null) {
                        while (r10 < daVar.s1.O0.getChildCount()) {
                            View childAt = daVar.s1.O0.getChildAt(r10);
                            if (childAt instanceof dg.a2) {
                                ((dg.a2) childAt).setupTheme(daVar.H1);
                            }
                            r10++;
                        }
                    }
                    daVar.o0(true);
                    break;
                }
                break;
            case 5:
                daVar.q(true);
                break;
            case 6:
                daVar.d = true;
                daVar.v = false;
                if (daVar.G == 1) {
                    daVar.e0.setAlpha(1.0f);
                    daVar.e0.setTranslationX(0.0f);
                    daVar.e0.setTranslationY(0.0f);
                    daVar.f0.setAlpha(1.0f);
                    daVar.h0.setAlpha(1.0f);
                    daVar.n.setBackgroundColor(-16777216);
                    if (daVar.c0 == 2) {
                        daVar.r1.setAlpha(1.0f);
                    }
                }
                h8 h8Var = daVar.u2;
                if (h8Var != null) {
                    h8Var.run();
                    daVar.u2 = null;
                } else {
                    daVar.P();
                }
                u6 u6Var7 = daVar.H1;
                if (u6Var7 != null && u6Var7.n) {
                    daVar.u();
                    daVar.H();
                    daVar.s();
                    break;
                } else if (u6Var7 != null && u6Var7.u) {
                    if (u6Var7.K) {
                        daVar.U0.t(u6Var7, null, 0L);
                    }
                    daVar.s();
                    break;
                }
                break;
            case 7:
                daVar.g(1.0f, true, new h8(daVar, 6));
                break;
            case 8:
                daVar.x0.setCameraThumb(daVar.A());
                i9 i9Var = daVar.y0;
                if (i9Var != null) {
                    i9Var.destroy(true, null);
                    AndroidUtilities.removeFromParent(daVar.y0);
                    r9 r9Var = daVar.x0;
                    if (r9Var != null) {
                        r9Var.setCameraView(null);
                    }
                    daVar.y0 = null;
                    break;
                }
                break;
            case 9:
                daVar.x0.setCameraThumb(daVar.A());
                break;
            case 10:
                if (daVar.c0 == 1) {
                    daVar.l0(2, false, true);
                    break;
                }
                break;
            case 11:
                w8 w8Var = daVar.a1;
                if (w8Var != null) {
                    int i18 = -(AndroidUtilities.dp(24.0f) + daVar.Z0.getEditTextHeight());
                    w8Var.setTranslationY(i18 - (daVar.W0 != null ? r3.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                r9 r9Var2 = daVar.x0;
                if (r9Var2 != null) {
                    r9Var2.c.a(daVar.A0.y ? daVar.z0.d : null);
                    break;
                }
                break;
            case 13:
                daVar.m0(true);
                break;
            case 14:
                daVar.s();
                break;
            case 15:
                t9 t9Var = daVar.Z0;
                if (t9Var != null) {
                    t9Var.m();
                    break;
                }
                break;
            case 16:
                if (daVar.d0 == -1 && daVar.c0 == 1) {
                    t9 t9Var2 = daVar.Z0;
                    if (!t9Var2.m0 && !t9Var2.L1) {
                        oa oaVar = daVar.W0;
                        if (!oaVar.M) {
                            w8 w8Var2 = daVar.a1;
                            if (w8Var2.J) {
                                w8Var2.c(false, true);
                                break;
                            } else {
                                daVar.l0(0, false, true);
                                h9 h9Var2 = daVar.s1;
                                if (h9Var2 != null) {
                                    h9Var2.R0(2);
                                    h9Var2.i2 = true;
                                    h9Var2.o0(true);
                                    daVar.s1.J0 = true;
                                    break;
                                }
                            }
                        } else {
                            oaVar.M = false;
                            if (oaVar.B && oaVar.h == null) {
                                oaVar.D = true;
                                ia iaVar = oaVar.a;
                                if (iaVar != null) {
                                    iaVar.f0(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                daVar.K1 = true;
                daVar.Y0.setShareEnabled(false);
                n0 n0Var = daVar.b1;
                n0Var.getClass();
                n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 18:
                daVar.x0.setCameraThumb(daVar.A());
                break;
            case 19:
                ca caVar2 = daVar.n;
                nh.b bVar = daVar.a;
                new qc(caVar2, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new h8(daVar, i12), bVar)).k(true);
                break;
            case 20:
                f8 f8Var = daVar.n0;
                if (f8Var != null) {
                    f8Var.dismiss();
                }
                daVar.K(2, true);
                break;
            case 21:
                daVar.l0(-1, false, true);
                break;
            case 22:
                daVar.l0(-1, false, true);
                break;
            case 23:
                daVar.d = false;
                AndroidUtilities.unlockOrientation(daVar.b);
                if (daVar.y0 != null) {
                    if (daVar.N1) {
                        CameraController.getInstance().stopVideoRecording(daVar.y0.getCameraSession(), false);
                    }
                    daVar.v(false);
                }
                s9 s9Var3 = daVar.U0;
                if (s9Var3 != null) {
                    s9Var3.set(null);
                }
                daVar.z();
                daVar.y();
                File file = daVar.D1;
                if (file != null && !daVar.v) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                daVar.D1 = null;
                AndroidUtilities.runOnUIThread(new h8(daVar, 28), 16L);
                y9 y9Var = daVar.C;
                if (y9Var != null) {
                    y9Var.f(false);
                }
                if (daVar.u2 != null) {
                    daVar.u2 = null;
                }
                daVar.i2 = null;
                da daVar2 = da.C2;
                if (daVar2 != null) {
                    daVar2.q(false);
                }
                da.C2 = null;
                ca caVar3 = daVar.n;
                if (caVar3 != null) {
                    ic.h(caVar3);
                }
                q9 q9Var = daVar.i0;
                if (q9Var != null) {
                    ic.h(q9Var);
                }
                r9 r9Var3 = daVar.x0;
                if (r9Var3 != null) {
                    r9Var3.e();
                    break;
                }
                break;
            case 24:
                if (!daVar.H1.b0 && daVar.n0 != null && (s9Var = daVar.U0) != null) {
                    s9Var.h(new i8(daVar, i14), s9Var, daVar.t1, daVar.w1);
                }
                daVar.K(1, true);
                break;
            case 25:
                daVar.j0(false);
                daVar.b2 = null;
                break;
            case 26:
                daVar.j0(false);
                daVar.b2 = null;
                break;
            case 27:
                daVar.T();
                break;
            default:
                WindowManager windowManager = daVar.f;
                if (windowManager != null && (caVar = daVar.n) != null && caVar.getParent() != null) {
                    windowManager.removeView(daVar.n);
                    break;
                }
                break;
        }
    }
}

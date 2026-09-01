package qh;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ h8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z4;
        ma maVar;
        u8 u8Var;
        switch (this.a) {
            case 0:
                d2 d2Var = this.b.s;
                d2Var.p = ((Float) obj).floatValue();
                d2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ca caVar = this.b;
                s6 s6Var = caVar.H1;
                if (s6Var != null) {
                    AndroidUtilities.recycleBitmap(s6Var.g0);
                    caVar.H1.g0 = bitmap;
                    d8 d8Var = caVar.n0;
                    if (d8Var != null) {
                        d8Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                s6 s6Var2 = (s6) obj;
                ca caVar2 = this.b;
                caVar2.W(s6Var2, false);
                int i10 = caVar2.c;
                oh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                oh.s6 s6Var3 = new oh.s6(storiesController, s6Var2);
                boolean z10 = s6Var2.g;
                long j10 = s6Var3.G;
                if (z10) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(s6Var2.f), s6Var3);
                } else {
                    storiesController.d(j10, s6Var3, storiesController.b, false);
                }
                storiesController.d(j10, s6Var3, storiesController.c, true);
                if (j10 != UserConfig.getInstance(i11).clientUserId) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            z4 = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == j10) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i12));
                            z4 = true;
                        } else {
                            i12++;
                        }
                    }
                    if (!z4) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i13));
                                    z4 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    if (!z4) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i11).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                s6Var3.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (s6Var2.c && !s6Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.c(s6Var2);
                }
                if (s6Var2.e1 != 0) {
                    ConnectionsManager.getInstance(s6Var2.a).cancelRequest(s6Var2.e1, true);
                    break;
                }
                break;
            case 3:
                l5 l5Var = (l5) obj;
                ca caVar3 = this.b;
                if (caVar3.z0 != null) {
                    caVar3.A0.setLink(l5Var == null ? null : l5Var.a);
                    p9 p9Var = caVar3.x0;
                    if (p9Var != null) {
                        p9Var.c.a(caVar3.A0.y ? caVar3.z0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                s6 s6Var4 = this.b.H1;
                if (s6Var4 != null) {
                    s6Var4.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                ca caVar4 = this.b;
                oh.b bVar = caVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(caVar4.b, new hg.w(13)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = caVar4.r.getWidth();
                    layout.y = (int) (caVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.a;
                    cbVar.getWindow().setAttributes(cbVar.b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.k6.gc, 0, new g8(caVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ca caVar5 = this.b;
                if (booleanValue && (maVar = caVar5.W0) != null && maVar.M) {
                    maVar.M = false;
                    if (maVar.B && maVar.h == null) {
                        maVar.D = true;
                        ga gaVar = maVar.a;
                        if (gaVar != null) {
                            gaVar.j0(true);
                        }
                    }
                }
                caVar5.U0.x(2, bool.booleanValue());
                caVar5.V0.clearAnimation();
                caVar5.V0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                ic icVar = ic.w;
                if (icVar != null && icVar.a == 2) {
                    icVar.l();
                    break;
                }
                break;
            case 7:
                ca caVar6 = this.b;
                caVar6.l();
                caVar6.m();
                caVar6.i((Runnable) obj);
                break;
            case 8:
                r rVar = (r) obj;
                ca caVar7 = this.b;
                p9 p9Var2 = caVar7.x0;
                caVar7.w0 = rVar;
                p9Var2.o(rVar);
                caVar7.F0.setSelected(rVar);
                g9 g9Var = caVar7.y0;
                if (g9Var != null) {
                    g9Var.recordHevc = !caVar7.x0.j();
                }
                caVar7.D0.setDrawable(new lc0(rVar, false));
                caVar7.c0(caVar7.E0, caVar7.F0.e, true);
                caVar7.L0.e(caVar7.x0.j() ? caVar7.x0.getFilledProgress() : 0.0f, true);
                c9 c9Var = caVar7.J0;
                if (c9Var != null) {
                    c9Var.setMultipleOnClick(caVar7.x0.j());
                    caVar7.J0.setMaxCount(Math.min(10, r.b() - caVar7.x0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                ca caVar8 = this.b;
                caVar8.L = true;
                caVar8.q(true);
                AndroidUtilities.runOnUIThread(new hg.n0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                ca caVar9 = this.b;
                if (!caVar9.M1 && !caVar9.N1) {
                    int intValue2 = num2.intValue();
                    caVar9.L1 = intValue2;
                    caVar9.l0.a(intValue2 == -1, true);
                    caVar9.i0(caVar9.L1 == 1 && !caVar9.F0.e, true);
                    caVar9.N0.a(num2.intValue());
                    r5 r5Var = caVar9.L0;
                    boolean z11 = num2.intValue() == 1;
                    r5Var.k0 = -1.0f;
                    r5Var.l0 = z11;
                    r5Var.invalidate();
                    if (num2.intValue() == -1) {
                        g9 g9Var2 = caVar9.y0;
                        if (g9Var2 != null && g9Var2.isDual()) {
                            caVar9.y0.toggleDual();
                        }
                        f3 f3Var = caVar9.i1;
                        if (f3Var != null) {
                            f3Var.e(true);
                        }
                        f3 f3Var2 = caVar9.j1;
                        if (f3Var2 != null) {
                            f3Var2.e(true);
                        }
                        f3 f3Var3 = caVar9.T0;
                        if (f3Var3 != null) {
                            f3Var3.e(true);
                        }
                        caVar9.x0.o(null);
                        caVar9.x0.e();
                        caVar9.F0.setSelected((r) null);
                        g9 g9Var3 = caVar9.y0;
                        if (g9Var3 != null) {
                            g9Var3.recordHevc = !caVar9.x0.j();
                        }
                    }
                    caVar9.F0.a(false, true);
                    caVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                ca caVar10 = this.b;
                r5 r5Var2 = caVar10.L0;
                r5Var2.k0 = f10.floatValue();
                r5Var2.invalidate();
                caVar10.L0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                caVar10.L0.setAlpha(Utilities.clamp01(f10.floatValue() + 1.0f));
                caVar10.M0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                caVar10.M0.setAlpha(AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f));
                caVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                caVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                caVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                if (f10.floatValue() < 0.0f) {
                    caVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                ca caVar11 = this.b;
                if (caVar11.H1 != null) {
                    r9 r9Var = caVar11.Z0;
                    if (!r9Var.L1) {
                        r9Var.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                caVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            caVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        caVar11.u();
                                        caVar11.H();
                                        f9 f9Var = caVar11.s1;
                                        if (f9Var != null) {
                                            f9Var.R0(1);
                                            f9Var.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    caVar11.l0(0, false, true);
                                    f9 f9Var2 = caVar11.s1;
                                    if (f9Var2 != null) {
                                        f9Var2.R0(2);
                                        f9Var2.i2 = true;
                                        f9Var2.o0(true);
                                        caVar11.s1.J0 = true;
                                        break;
                                    }
                                }
                            } else {
                                caVar11.l0(0, false, true);
                                f9 f9Var3 = caVar11.s1;
                                if (f9Var3 != null) {
                                    f9Var3.J0 = false;
                                    f9Var3.R0(0);
                                    f9Var3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            caVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                ca caVar12 = this.b;
                FrameLayout frameLayout = caVar12.V0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(caVar12.d0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + caVar12.Z0.getEditTextHeight())));
                }
                u8 u8Var2 = caVar12.a1;
                if (u8Var2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + caVar12.Z0.getEditTextHeight());
                    u8Var2.setTranslationY(i14 - (caVar12.W0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                ic icVar2 = ic.w;
                if (icVar2 != null && icVar2.a == 2) {
                    icVar2.l();
                }
                if (caVar12.Z0.m0 && (u8Var = caVar12.a1) != null) {
                    u8Var.c(false, true);
                    break;
                }
                break;
            case 14:
                b8 b8Var = (b8) obj;
                ca caVar13 = this.b;
                s6 s6Var5 = caVar13.H1;
                if (s6Var5 != null) {
                    s6Var5.E0 = b8Var;
                }
                ArrayList arrayList3 = caVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((s6) obj2).E0 = b8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ca caVar14 = this.b;
                s6 s6Var6 = caVar14.H1;
                if (s6Var6 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    s6Var6.v0 = inputPeer;
                    ArrayList arrayList4 = caVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((s6) obj3).v0 = caVar14.H1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ca caVar15 = this.b;
                s6 s6Var7 = caVar15.H1;
                if (s6Var7 != null) {
                    s6Var7.w0 = hashSet;
                    ArrayList arrayList5 = caVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((s6) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ca caVar16 = this.b;
                s6 s6Var8 = caVar16.H1;
                if (s6Var8 != null) {
                    Bitmap bitmap3 = s6Var8.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    caVar16.H1.g0 = bitmap2;
                    d8 d8Var2 = caVar16.n0;
                    if (d8Var2 != null) {
                        d8Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.v0 = (b8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ca caVar17 = this.b;
                l6 l6Var = caVar17.l0;
                caVar17.u0 = inputPeer2;
                l6Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ca caVar18 = this.b;
                l6 l6Var2 = caVar18.l0;
                caVar18.u0 = inputPeer3;
                l6Var2.set(inputPeer3);
                break;
            default:
                d2 d2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                d2Var2.o = floatValue;
                d2Var2.n = d2.f(floatValue);
                d2Var2.g();
                break;
        }
    }
}

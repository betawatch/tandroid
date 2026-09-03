package ph;

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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ h8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z4;
        oa oaVar;
        v8 v8Var;
        switch (this.a) {
            case 0:
                d2 d2Var = this.b.s;
                d2Var.p = ((Float) obj).floatValue();
                d2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                da daVar = this.b;
                t6 t6Var = daVar.H1;
                if (t6Var != null) {
                    AndroidUtilities.recycleBitmap(t6Var.g0);
                    daVar.H1.g0 = bitmap;
                    e8 e8Var = daVar.n0;
                    if (e8Var != null) {
                        e8Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                t6 t6Var2 = (t6) obj;
                da daVar2 = this.b;
                daVar2.W(t6Var2, false);
                int i10 = daVar2.c;
                nh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                nh.s6 s6Var = new nh.s6(storiesController, t6Var2);
                boolean z10 = t6Var2.g;
                long j10 = s6Var.G;
                if (z10) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(t6Var2.f), s6Var);
                } else {
                    storiesController.d(j10, s6Var, storiesController.b, false);
                }
                storiesController.d(j10, s6Var, storiesController.c, true);
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
                s6Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (t6Var2.c && !t6Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.c(t6Var2);
                }
                if (t6Var2.e1 != 0) {
                    ConnectionsManager.getInstance(t6Var2.a).cancelRequest(t6Var2.e1, true);
                    break;
                }
                break;
            case 3:
                m5 m5Var = (m5) obj;
                da daVar3 = this.b;
                if (daVar3.z0 != null) {
                    daVar3.A0.setLink(m5Var == null ? null : m5Var.a);
                    r9 r9Var = daVar3.x0;
                    if (r9Var != null) {
                        r9Var.c.a(daVar3.A0.y ? daVar3.z0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                t6 t6Var3 = this.b.H1;
                if (t6Var3 != null) {
                    t6Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                da daVar4 = this.b;
                nh.b bVar = daVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(daVar4.b, new gg.w(13)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = daVar4.r.getWidth();
                    layout.y = (int) (daVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.a;
                    cbVar.getWindow().setAttributes(cbVar.b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new g8(daVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                da daVar5 = this.b;
                if (booleanValue && (oaVar = daVar5.W0) != null && oaVar.M) {
                    oaVar.M = false;
                    if (oaVar.B && oaVar.h == null) {
                        oaVar.D = true;
                        ia iaVar = oaVar.a;
                        if (iaVar != null) {
                            iaVar.Z0(true);
                        }
                    }
                }
                daVar5.U0.x(2, bool.booleanValue());
                daVar5.V0.clearAnimation();
                daVar5.V0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                ic icVar = ic.w;
                if (icVar != null && icVar.a == 2) {
                    icVar.l();
                    break;
                }
                break;
            case 7:
                da daVar6 = this.b;
                daVar6.l();
                daVar6.m();
                daVar6.i((Runnable) obj);
                break;
            case 8:
                r rVar = (r) obj;
                da daVar7 = this.b;
                r9 r9Var2 = daVar7.x0;
                daVar7.w0 = rVar;
                r9Var2.o(rVar);
                daVar7.F0.setSelected(rVar);
                i9 i9Var = daVar7.y0;
                if (i9Var != null) {
                    i9Var.recordHevc = !daVar7.x0.j();
                }
                daVar7.D0.setDrawable(new kc0(rVar, false));
                daVar7.c0(daVar7.E0, daVar7.F0.e, true);
                daVar7.L0.e(daVar7.x0.j() ? daVar7.x0.getFilledProgress() : 0.0f, true);
                e9 e9Var = daVar7.J0;
                if (e9Var != null) {
                    e9Var.setMultipleOnClick(daVar7.x0.j());
                    daVar7.J0.setMaxCount(Math.min(10, r.b() - daVar7.x0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                da daVar8 = this.b;
                daVar8.L = true;
                daVar8.q(true);
                AndroidUtilities.runOnUIThread(new gg.n0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                da daVar9 = this.b;
                if (!daVar9.M1 && !daVar9.N1) {
                    int intValue2 = num2.intValue();
                    daVar9.L1 = intValue2;
                    daVar9.l0.a(intValue2 == -1, true);
                    daVar9.i0(daVar9.L1 == 1 && !daVar9.F0.e, true);
                    daVar9.N0.a(num2.intValue());
                    s5 s5Var = daVar9.L0;
                    boolean z11 = num2.intValue() == 1;
                    s5Var.k0 = -1.0f;
                    s5Var.l0 = z11;
                    s5Var.invalidate();
                    if (num2.intValue() == -1) {
                        i9 i9Var2 = daVar9.y0;
                        if (i9Var2 != null && i9Var2.isDual()) {
                            daVar9.y0.toggleDual();
                        }
                        f3 f3Var = daVar9.i1;
                        if (f3Var != null) {
                            f3Var.e(true);
                        }
                        f3 f3Var2 = daVar9.j1;
                        if (f3Var2 != null) {
                            f3Var2.e(true);
                        }
                        f3 f3Var3 = daVar9.T0;
                        if (f3Var3 != null) {
                            f3Var3.e(true);
                        }
                        daVar9.x0.o(null);
                        daVar9.x0.e();
                        daVar9.F0.setSelected((r) null);
                        i9 i9Var3 = daVar9.y0;
                        if (i9Var3 != null) {
                            i9Var3.recordHevc = !daVar9.x0.j();
                        }
                    }
                    daVar9.F0.a(false, true);
                    daVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                da daVar10 = this.b;
                s5 s5Var2 = daVar10.L0;
                s5Var2.k0 = f10.floatValue();
                s5Var2.invalidate();
                daVar10.L0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                daVar10.L0.setAlpha(Utilities.clamp01(f10.floatValue() + 1.0f));
                daVar10.M0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                daVar10.M0.setAlpha(AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f));
                daVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                daVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                daVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                if (f10.floatValue() < 0.0f) {
                    daVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                da daVar11 = this.b;
                if (daVar11.H1 != null) {
                    t9 t9Var = daVar11.Z0;
                    if (!t9Var.L1) {
                        t9Var.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                daVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            daVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        daVar11.u();
                                        daVar11.H();
                                        h9 h9Var = daVar11.s1;
                                        if (h9Var != null) {
                                            h9Var.R0(1);
                                            h9Var.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    daVar11.l0(0, false, true);
                                    h9 h9Var2 = daVar11.s1;
                                    if (h9Var2 != null) {
                                        h9Var2.R0(2);
                                        h9Var2.i2 = true;
                                        h9Var2.o0(true);
                                        daVar11.s1.J0 = true;
                                        break;
                                    }
                                }
                            } else {
                                daVar11.l0(0, false, true);
                                h9 h9Var3 = daVar11.s1;
                                if (h9Var3 != null) {
                                    h9Var3.J0 = false;
                                    h9Var3.R0(0);
                                    h9Var3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            daVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                da daVar12 = this.b;
                FrameLayout frameLayout = daVar12.V0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(daVar12.d0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + daVar12.Z0.getEditTextHeight())));
                }
                v8 v8Var2 = daVar12.a1;
                if (v8Var2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + daVar12.Z0.getEditTextHeight());
                    v8Var2.setTranslationY(i14 - (daVar12.W0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                ic icVar2 = ic.w;
                if (icVar2 != null && icVar2.a == 2) {
                    icVar2.l();
                }
                if (daVar12.Z0.m0 && (v8Var = daVar12.a1) != null) {
                    v8Var.c(false, true);
                    break;
                }
                break;
            case 14:
                c8 c8Var = (c8) obj;
                da daVar13 = this.b;
                t6 t6Var4 = daVar13.H1;
                if (t6Var4 != null) {
                    t6Var4.E0 = c8Var;
                }
                ArrayList arrayList3 = daVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((t6) obj2).E0 = c8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                da daVar14 = this.b;
                t6 t6Var5 = daVar14.H1;
                if (t6Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    t6Var5.v0 = inputPeer;
                    ArrayList arrayList4 = daVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((t6) obj3).v0 = daVar14.H1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                da daVar15 = this.b;
                t6 t6Var6 = daVar15.H1;
                if (t6Var6 != null) {
                    t6Var6.w0 = hashSet;
                    ArrayList arrayList5 = daVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((t6) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                da daVar16 = this.b;
                t6 t6Var7 = daVar16.H1;
                if (t6Var7 != null) {
                    Bitmap bitmap3 = t6Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    daVar16.H1.g0 = bitmap2;
                    e8 e8Var2 = daVar16.n0;
                    if (e8Var2 != null) {
                        e8Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.v0 = (c8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                da daVar17 = this.b;
                m6 m6Var = daVar17.l0;
                daVar17.u0 = inputPeer2;
                m6Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                da daVar18 = this.b;
                m6 m6Var2 = daVar18.l0;
                daVar18.u0 = inputPeer3;
                m6Var2.set(inputPeer3);
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

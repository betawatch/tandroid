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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ g8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z4;
        la laVar;
        t8 t8Var;
        switch (this.a) {
            case 0:
                c2 c2Var = this.b.s;
                c2Var.p = ((Float) obj).floatValue();
                c2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ba baVar = this.b;
                r6 r6Var = baVar.H1;
                if (r6Var != null) {
                    AndroidUtilities.recycleBitmap(r6Var.g0);
                    baVar.H1.g0 = bitmap;
                    c8 c8Var = baVar.n0;
                    if (c8Var != null) {
                        c8Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                r6 r6Var2 = (r6) obj;
                ba baVar2 = this.b;
                baVar2.W(r6Var2, false);
                int i10 = baVar2.c;
                oh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                oh.s6 s6Var = new oh.s6(storiesController, r6Var2);
                boolean z10 = r6Var2.g;
                long j10 = s6Var.G;
                if (z10) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(r6Var2.f), s6Var);
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
                if (r6Var2.c && !r6Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.c(r6Var2);
                }
                if (r6Var2.e1 != 0) {
                    ConnectionsManager.getInstance(r6Var2.a).cancelRequest(r6Var2.e1, true);
                    break;
                }
                break;
            case 3:
                k5 k5Var = (k5) obj;
                ba baVar3 = this.b;
                if (baVar3.z0 != null) {
                    baVar3.A0.setLink(k5Var == null ? null : k5Var.a);
                    o9 o9Var = baVar3.x0;
                    if (o9Var != null) {
                        o9Var.c.a(baVar3.A0.y ? baVar3.z0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                r6 r6Var3 = this.b.H1;
                if (r6Var3 != null) {
                    r6Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                ba baVar4 = this.b;
                oh.b bVar = baVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                bb bbVar = new cb(baVar4.b, new hg.w(13)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = baVar4.r.getWidth();
                    layout.y = (int) (baVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    cb cbVar = bbVar.a;
                    cbVar.getWindow().setAttributes(cbVar.b);
                }
                bbVar.setTouchable(true);
                new qc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.k6.gc, 0, new f8(baVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ba baVar5 = this.b;
                if (booleanValue && (laVar = baVar5.W0) != null && laVar.M) {
                    laVar.M = false;
                    if (laVar.B && laVar.h == null) {
                        laVar.D = true;
                        fa faVar = laVar.a;
                        if (faVar != null) {
                            faVar.j0(true);
                        }
                    }
                }
                baVar5.U0.x(2, bool.booleanValue());
                baVar5.V0.clearAnimation();
                baVar5.V0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                ic icVar = ic.w;
                if (icVar != null && icVar.a == 2) {
                    icVar.l();
                    break;
                }
                break;
            case 7:
                ba baVar6 = this.b;
                baVar6.l();
                baVar6.m();
                baVar6.i((Runnable) obj);
                break;
            case 8:
                r rVar = (r) obj;
                ba baVar7 = this.b;
                o9 o9Var2 = baVar7.x0;
                baVar7.w0 = rVar;
                o9Var2.o(rVar);
                baVar7.F0.setSelected(rVar);
                f9 f9Var = baVar7.y0;
                if (f9Var != null) {
                    f9Var.recordHevc = !baVar7.x0.j();
                }
                baVar7.D0.setDrawable(new lc0(rVar, false));
                baVar7.c0(baVar7.E0, baVar7.F0.e, true);
                baVar7.L0.e(baVar7.x0.j() ? baVar7.x0.getFilledProgress() : 0.0f, true);
                b9 b9Var = baVar7.J0;
                if (b9Var != null) {
                    b9Var.setMultipleOnClick(baVar7.x0.j());
                    baVar7.J0.setMaxCount(Math.min(10, r.b() - baVar7.x0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                ba baVar8 = this.b;
                baVar8.L = true;
                baVar8.q(true);
                AndroidUtilities.runOnUIThread(new hg.n0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                ba baVar9 = this.b;
                if (!baVar9.M1 && !baVar9.N1) {
                    int intValue2 = num2.intValue();
                    baVar9.L1 = intValue2;
                    baVar9.l0.a(intValue2 == -1, true);
                    baVar9.i0(baVar9.L1 == 1 && !baVar9.F0.e, true);
                    baVar9.N0.a(num2.intValue());
                    q5 q5Var = baVar9.L0;
                    boolean z11 = num2.intValue() == 1;
                    q5Var.k0 = -1.0f;
                    q5Var.l0 = z11;
                    q5Var.invalidate();
                    if (num2.intValue() == -1) {
                        f9 f9Var2 = baVar9.y0;
                        if (f9Var2 != null && f9Var2.isDual()) {
                            baVar9.y0.toggleDual();
                        }
                        e3 e3Var = baVar9.i1;
                        if (e3Var != null) {
                            e3Var.e(true);
                        }
                        e3 e3Var2 = baVar9.j1;
                        if (e3Var2 != null) {
                            e3Var2.e(true);
                        }
                        e3 e3Var3 = baVar9.T0;
                        if (e3Var3 != null) {
                            e3Var3.e(true);
                        }
                        baVar9.x0.o(null);
                        baVar9.x0.e();
                        baVar9.F0.setSelected((r) null);
                        f9 f9Var3 = baVar9.y0;
                        if (f9Var3 != null) {
                            f9Var3.recordHevc = !baVar9.x0.j();
                        }
                    }
                    baVar9.F0.a(false, true);
                    baVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                ba baVar10 = this.b;
                q5 q5Var2 = baVar10.L0;
                q5Var2.k0 = f10.floatValue();
                q5Var2.invalidate();
                baVar10.L0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                baVar10.L0.setAlpha(Utilities.clamp01(f10.floatValue() + 1.0f));
                baVar10.M0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                baVar10.M0.setAlpha(AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f));
                baVar10.M0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                baVar10.M0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                baVar10.M0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                if (f10.floatValue() < 0.0f) {
                    baVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                ba baVar11 = this.b;
                if (baVar11.H1 != null) {
                    q9 q9Var = baVar11.Z0;
                    if (!q9Var.L1) {
                        q9Var.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                baVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            baVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        baVar11.u();
                                        baVar11.H();
                                        e9 e9Var = baVar11.s1;
                                        if (e9Var != null) {
                                            e9Var.R0(1);
                                            e9Var.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    baVar11.l0(0, false, true);
                                    e9 e9Var2 = baVar11.s1;
                                    if (e9Var2 != null) {
                                        e9Var2.R0(2);
                                        e9Var2.i2 = true;
                                        e9Var2.o0(true);
                                        baVar11.s1.J0 = true;
                                        break;
                                    }
                                }
                            } else {
                                baVar11.l0(0, false, true);
                                e9 e9Var3 = baVar11.s1;
                                if (e9Var3 != null) {
                                    e9Var3.J0 = false;
                                    e9Var3.R0(0);
                                    e9Var3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            baVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                ba baVar12 = this.b;
                FrameLayout frameLayout = baVar12.V0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(baVar12.d0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + baVar12.Z0.getEditTextHeight())));
                }
                t8 t8Var2 = baVar12.a1;
                if (t8Var2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + baVar12.Z0.getEditTextHeight());
                    t8Var2.setTranslationY(i14 - (baVar12.W0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                ic icVar2 = ic.w;
                if (icVar2 != null && icVar2.a == 2) {
                    icVar2.l();
                }
                if (baVar12.Z0.m0 && (t8Var = baVar12.a1) != null) {
                    t8Var.c(false, true);
                    break;
                }
                break;
            case 14:
                a8 a8Var = (a8) obj;
                ba baVar13 = this.b;
                r6 r6Var4 = baVar13.H1;
                if (r6Var4 != null) {
                    r6Var4.E0 = a8Var;
                }
                ArrayList arrayList3 = baVar13.E1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((r6) obj2).E0 = a8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ba baVar14 = this.b;
                r6 r6Var5 = baVar14.H1;
                if (r6Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    r6Var5.v0 = inputPeer;
                    ArrayList arrayList4 = baVar14.E1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((r6) obj3).v0 = baVar14.H1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ba baVar15 = this.b;
                r6 r6Var6 = baVar15.H1;
                if (r6Var6 != null) {
                    r6Var6.w0 = hashSet;
                    ArrayList arrayList5 = baVar15.E1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((r6) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ba baVar16 = this.b;
                r6 r6Var7 = baVar16.H1;
                if (r6Var7 != null) {
                    Bitmap bitmap3 = r6Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    baVar16.H1.g0 = bitmap2;
                    c8 c8Var2 = baVar16.n0;
                    if (c8Var2 != null) {
                        c8Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.v0 = (a8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ba baVar17 = this.b;
                j6 j6Var = baVar17.l0;
                baVar17.u0 = inputPeer2;
                j6Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ba baVar18 = this.b;
                j6 j6Var2 = baVar18.l0;
                baVar18.u0 = inputPeer3;
                j6Var2.set(inputPeer3);
                break;
            default:
                c2 c2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                c2Var2.o = floatValue;
                c2Var2.n = c2.f(floatValue);
                c2Var2.g();
                break;
        }
    }
}

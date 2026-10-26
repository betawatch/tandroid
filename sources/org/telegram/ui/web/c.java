package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import bi.dd;
import bi.n7;
import bi.rc;
import bi.t9;
import di.y2;
import fi.e4;
import fi.kc;
import hi.p4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ak;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.go;
import org.telegram.ui.un;
import sg.p2;
import vg.b0;
import vg.j;
import zh.f4;
import zh.g4;
import zh.h4;
import zh.i4;
import zh.l4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sg.m2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 5;
        final int i11 = 0;
        final int i12 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                org.telegram.ui.x xVar = (org.telegram.ui.x) this.c;
                lVar.b = true;
                xVar.run();
                lVar.w.g3.O(true);
                break;
            case 1:
                rg.y yVar = (rg.y) this.b;
                Context context = (Context) this.c;
                if (!yVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    rg.n nVar = new rg.n(yVar, context, createBitmap);
                    yVar.n.f().addView(nVar, gb1.g(-1.0f, -1));
                    rg.v vVar = yVar.n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new n7(vVar, i10));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(ds.f);
                    duration.addUpdateListener(new e4(nVar, 22));
                    duration.start();
                    yVar.n.a();
                    yVar.dismiss();
                    break;
                }
                break;
            case 2:
                p2 p2Var = (p2) this.b;
                kc kcVar = (kc) this.c;
                sg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j10 = p2Var.j(p2Var.n0, p2Var.o0)) != null) {
                    kcVar.run(j10);
                    break;
                }
                break;
            case 3:
                go.g0((un) this.c, 41026, new ig.o((sh.c) this.b, 20), null);
                break;
            case 4:
                tg.j0.V((tg.j0) this.b, (Context) this.c);
                break;
            case 5:
                vg.s0 s0Var = (vg.s0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = s0Var.X;
                if (!arrayList.isEmpty()) {
                    vg.d0 d0Var = s0Var.a0;
                    if (!d0Var.Q) {
                        d0Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        vg.s.a(chat.id, arrayList2, new y2(s0Var, chat, arrayList2, hashSet, 17), new ig.o(s0Var, 24));
                        break;
                    }
                }
                break;
            case 6:
                vg.n1 n1Var = (vg.n1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = n1Var.h0;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var.n0.remove(l4);
                }
                n1Var.W();
                n1Var.Z.b(true, hashSet2, new vg.a1(n1Var, i10), null);
                n1Var.i0(true, true);
                n1Var.X();
                break;
            case 7:
                vg.n1.S((vg.n1) this.b, (TLRPC.User) this.c, view);
                break;
            case 8:
                final wg.e eVar = (wg.e) this.b;
                final xg.a aVar = (xg.a) this.c;
                if (!eVar.d) {
                    ((vg.b0) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.Q) {
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: wg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar;
                                    AndroidUtilities.runOnUIThread(new ti.g(b0Var, 10), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    j.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: wg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i12) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar;
                                    AndroidUtilities.runOnUIThread(new ti.g(b0Var, 10), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    j.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new vg.p(callback2, callback, i11), 2);
                    break;
                }
                break;
            case 9:
                xg.g gVar = (xg.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                xg.f fVar = gVar.v;
                if (fVar != null) {
                    vg.a0 a0Var = ((vg.u) fVar).a;
                    a0Var.c0.remove(chat2);
                    a0Var.a0(true, true);
                    break;
                }
                break;
            case 10:
                ((ig.o) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 11:
                ((ig.o) this.b).run((TLRPC.Chat) this.c);
                break;
            case 12:
                zh.c.P((zh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 13:
                h4 h4Var = (h4) this.b;
                rc rcVar = (rc) this.c;
                h4Var.getClass();
                if (rcVar.f > 0) {
                    h4Var.presentFragment(new dd());
                    break;
                }
                break;
            case 14:
                g4.P((g4) this.b, (f4) this.c);
                break;
            case 15:
                l4 l4Var = (l4) this.b;
                p4 p4Var = (p4) this.c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = l4Var.Y.l;
                        int size3 = arrayList5.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size3) {
                                Object obj3 = arrayList5.get(i13);
                                i13++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i14 = savedStarGift.msg_id;
                                if ((i14 == 0 || i14 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    p4Var.run(arrayList4);
                    l4Var.dismiss();
                    break;
                }
                break;
            default:
                i4 i4Var = (i4) this.b;
                ak akVar = (ak) this.c;
                t9 t9Var = i4Var.c.Y;
                t9Var.e = !t9Var.e;
                akVar.run();
                t9Var.j(true);
                break;
        }
    }
}

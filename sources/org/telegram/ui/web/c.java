package org.telegram.ui.web;

import ai.ad;
import ai.md;
import ai.q7;
import ai.y9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.y2;
import ei.i6;
import ei.oc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fo;
import org.telegram.ui.sn;
import tg.p;
import ug.a0;
import ug.i;
import w7.z5;
import yh.e4;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.k4;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        rg.j2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 5;
        final int i11 = 0;
        final int i12 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.c;
                lVar.b = true;
                yVar.run();
                lVar.w.W2.N(true);
                break;
            case 1:
                qg.x xVar = (qg.x) this.b;
                Context context = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar, context, createBitmap);
                    xVar.n.f().addView(nVar, z5.c(-1.0f, -1));
                    qg.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new q7(uVar, i10));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f);
                    duration.addUpdateListener(new i6(nVar, 19));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 2:
                rg.m2 m2Var = (rg.m2) this.b;
                oc ocVar = (oc) this.c;
                rg.j2[] j2VarArr = m2Var.H;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.I != null && (j10 = m2Var.j(m2Var.n0, m2Var.o0)) != null) {
                    ocVar.run(j10);
                    break;
                }
                break;
            case 3:
                fo.g0((sn) this.c, 41026, new ig.l0((rh.c) this.b, 16), null);
                break;
            case 4:
                sg.k0.W((sg.k0) this.b, (Context) this.c);
                break;
            case 5:
                ug.r0 r0Var = (ug.r0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = r0Var.X;
                if (!arrayList.isEmpty()) {
                    ug.c0 c0Var = r0Var.a0;
                    if (!c0Var.N) {
                        c0Var.setLoading(true);
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
                        ug.r.a(chat.id, arrayList2, new y2(r0Var, chat, arrayList2, hashSet, 17), new ig.l0(r0Var, 20));
                        break;
                    }
                }
                break;
            case 6:
                ug.m1 m1Var = (ug.m1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var.h0;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var.n0.remove(l4);
                }
                m1Var.X();
                m1Var.Z.b(true, hashSet2, new ug.z0(m1Var, i10), null);
                m1Var.j0(true, true);
                m1Var.Y();
                break;
            case 7:
                ug.m1.T((ug.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 8:
                final vg.e eVar = (vg.e) this.b;
                final wg.a aVar = (wg.a) this.c;
                if (!eVar.d) {
                    ((ug.a0) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.N) {
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    a0 a0Var = (a0) eVar;
                                    AndroidUtilities.runOnUIThread(new p(a0Var, 7), 200L);
                                    a0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    i.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i12) {
                                case 0:
                                    aVar.b(false);
                                    a0 a0Var = (a0) eVar;
                                    AndroidUtilities.runOnUIThread(new p(a0Var, 7), 200L);
                                    a0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    i.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.o(callback2, callback, i11), 2);
                    break;
                }
                break;
            case 9:
                wg.g gVar = (wg.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                wg.f fVar = gVar.v;
                if (fVar != null) {
                    ug.z zVar = ((ug.t) fVar).a;
                    zVar.c0.remove(chat2);
                    zVar.b0(true, true);
                    break;
                }
                break;
            case 10:
                ((ig.l0) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 11:
                ((ig.l0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 12:
                yh.c.Q((yh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 13:
                g4 g4Var = (g4) this.b;
                ad adVar = (ad) this.c;
                g4Var.getClass();
                if (adVar.f > 0) {
                    g4Var.presentFragment(new md());
                    break;
                }
                break;
            case 14:
                f4.Q((f4) this.b, (e4) this.c);
                break;
            case 15:
                k4 k4Var = (k4) this.b;
                gi.g4 g4Var2 = (gi.g4) this.c;
                HashSet hashSet3 = k4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = k4Var.Y.l;
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
                    g4Var2.run(arrayList4);
                    k4Var.dismiss();
                    break;
                }
                break;
            default:
                h4 h4Var = (h4) this.b;
                vj vjVar = (vj) this.c;
                y9 y9Var = h4Var.c.Y;
                y9Var.e = !y9Var.e;
                vjVar.run();
                y9Var.j(true);
                break;
        }
    }
}

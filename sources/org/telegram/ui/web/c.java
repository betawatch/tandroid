package org.telegram.ui.web;

import ai.bd;
import ai.nd;
import ai.r7;
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
import org.telegram.messenger.xj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fo;
import org.telegram.ui.sn;
import rg.o2;
import tg.p;
import ug.z;
import w7.z5;
import yh.e4;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.k4;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        rg.l2 j10;
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
                lVar.w.Z2.N(true);
                break;
            case 1:
                qg.y yVar = (qg.y) this.b;
                Context context = (Context) this.c;
                if (!yVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(yVar, context, createBitmap);
                    yVar.n.f().addView(nVar, z5.c(-1.0f, -1));
                    qg.v vVar = yVar.n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new r7(vVar, i10));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f);
                    duration.addUpdateListener(new i6(nVar, 19));
                    duration.start();
                    yVar.n.a();
                    yVar.dismiss();
                    break;
                }
                break;
            case 2:
                o2 o2Var = (o2) this.b;
                oc ocVar = (oc) this.c;
                rg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.n0, o2Var.o0)) != null) {
                    ocVar.run(j10);
                    break;
                }
                break;
            case 3:
                fo.g0((sn) this.c, 41026, new ig.k0((rh.c) this.b, 16), null);
                break;
            case 4:
                sg.j0.V((sg.j0) this.b, (Context) this.c);
                break;
            case 5:
                ug.q0 q0Var = (ug.q0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = q0Var.X;
                if (!arrayList.isEmpty()) {
                    ug.b0 b0Var = q0Var.a0;
                    if (!b0Var.Q) {
                        b0Var.setLoading(true);
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
                        ug.q.a(chat.id, arrayList2, new y2(q0Var, chat, arrayList2, hashSet, 17), new ig.k0(q0Var, 20));
                        break;
                    }
                }
                break;
            case 6:
                ug.l1 l1Var = (ug.l1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = l1Var.h0;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    l1Var.n0.remove(l4);
                }
                l1Var.W();
                l1Var.Z.b(true, hashSet2, new ug.y0(l1Var, i10), null);
                l1Var.i0(true, true);
                l1Var.X();
                break;
            case 7:
                ug.l1.S((ug.l1) this.b, (TLRPC.User) this.c, view);
                break;
            case 8:
                final vg.e eVar = (vg.e) this.b;
                final wg.a aVar = (wg.a) this.c;
                if (!eVar.d) {
                    ((ug.z) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.Q) {
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    z zVar = (z) eVar;
                                    AndroidUtilities.runOnUIThread(new p(zVar, 7), 200L);
                                    zVar.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    ug.h.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
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
                                    z zVar = (z) eVar;
                                    AndroidUtilities.runOnUIThread(new p(zVar, 7), 200L);
                                    zVar.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    ug.h.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.n(callback2, callback, i11), 2);
                    break;
                }
                break;
            case 9:
                wg.g gVar = (wg.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                wg.f fVar = gVar.v;
                if (fVar != null) {
                    ug.y yVar2 = ((ug.s) fVar).a;
                    yVar2.c0.remove(chat2);
                    yVar2.a0(true, true);
                    break;
                }
                break;
            case 10:
                ((ig.k0) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 11:
                ((ig.k0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 12:
                yh.c.P((yh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 13:
                g4 g4Var = (g4) this.b;
                bd bdVar = (bd) this.c;
                g4Var.getClass();
                if (bdVar.f > 0) {
                    g4Var.presentFragment(new nd());
                    break;
                }
                break;
            case 14:
                f4.P((f4) this.b, (e4) this.c);
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
                xj xjVar = (xj) this.c;
                y9 y9Var = h4Var.c.Y;
                y9Var.e = !y9Var.e;
                xjVar.run();
                y9Var.j(true);
                break;
        }
    }
}

package qg;

import ai.ad;
import ai.md;
import ai.r7;
import ai.y9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.z2;
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
import org.telegram.ui.qn;
import rg.k2;
import rg.n2;
import tg.p;
import ug.a0;
import ug.i;
import w7.z5;
import yh.e4;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.k4;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 5;
        final int i11 = 0;
        final int i12 = 1;
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                Context context = (Context) this.c;
                if (!yVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    o oVar = new o(yVar, context, createBitmap);
                    yVar.n.f().addView(oVar, z5.c(-1.0f, -1));
                    v vVar = yVar.n;
                    Objects.requireNonNull(vVar);
                    oVar.setColorListener(new r7(vVar, i10));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f);
                    duration.addUpdateListener(new i6(oVar, 19));
                    duration.start();
                    yVar.n.a();
                    yVar.dismiss();
                    break;
                }
                break;
            case 1:
                n2 n2Var = (n2) this.b;
                oc ocVar = (oc) this.c;
                k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.n0, n2Var.o0)) != null) {
                    ocVar.run(j10);
                    break;
                }
                break;
            case 2:
                fo.g0((qn) this.c, 41026, new ig.l0((rh.c) this.b, 16), null);
                break;
            case 3:
                sg.k0.W((sg.k0) this.b, (Context) this.c);
                break;
            case 4:
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
                        ug.r.a(chat.id, arrayList2, new z2(r0Var, chat, arrayList2, hashSet, 17), new ig.l0(r0Var, 20));
                        break;
                    }
                }
                break;
            case 5:
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
            case 6:
                ug.m1.T((ug.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 7:
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
            case 8:
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
            case 9:
                ((ig.l0) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 10:
                ((ig.l0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 11:
                yh.c.Q((yh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 12:
                g4 g4Var = (g4) this.b;
                ad adVar = (ad) this.c;
                g4Var.getClass();
                if (adVar.f > 0) {
                    g4Var.presentFragment(new md());
                    break;
                }
                break;
            case 13:
                f4.Q((f4) this.b, (e4) this.c);
                break;
            case 14:
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

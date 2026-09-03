package org.telegram.ui;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk0 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ wk0(w61 w61Var, String str, boolean z4, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z10) {
        this.e = w61Var;
        this.b = str;
        this.c = z4;
        this.f = arrayList;
        this.g = hashMap;
        this.h = arrayList2;
        this.i = linkedHashSet;
        this.j = linkedHashSet2;
        this.k = arrayList3;
        this.l = arrayList4;
        this.d = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.e;
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f;
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.g;
                final boolean z4 = this.c;
                final String str = this.b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.i;
                final String[] strArr = (String[]) this.j;
                final boolean z10 = this.d;
                final org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.l;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
                    d2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.tk0
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.d2.this.dismiss();
                            org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                            if (urlAuthResult2 != null) {
                                h3Var2.dismiss();
                                zk0.b(z4, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, a1Var);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    yh.u(h3Var2.topBulletinContainer, h3Var2.getResourcesProvider(), tL_error, false);
                                    return;
                                }
                                h3Var2.dismiss();
                                org.telegram.ui.Components.qc a2 = zk0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                a2.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var)), i10).j();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final w61 w61Var = (w61) this.e;
                final String str3 = this.b;
                final boolean z11 = this.c;
                final ArrayList arrayList = (ArrayList) this.f;
                final HashMap hashMap = (HashMap) this.g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.j;
                final ArrayList arrayList3 = (ArrayList) this.k;
                final ArrayList arrayList4 = (ArrayList) this.l;
                final boolean z12 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.f51
                    @Override // java.lang.Runnable
                    public final void run() {
                        w61 w61Var2 = w61.this;
                        y41 y41Var = w61Var2.F1;
                        if (y41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(y41Var);
                            w61Var2.F1 = null;
                        }
                        String str4 = w61Var2.w1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        w61Var2.v1 = true;
                        w61Var2.z(true, z11);
                        n51 n51Var = w61Var2.c0;
                        if (n51Var != null) {
                            n51Var.d(true);
                        }
                        ArrayList arrayList5 = w61Var2.x1;
                        if (arrayList5 == null) {
                            w61Var2.x1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = w61Var2.A1;
                        if (arrayList6 == null) {
                            w61Var2.A1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = w61Var2.z1;
                        if (arrayList7 == null) {
                            w61Var2.z1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = w61Var2.y1;
                        if (arrayList8 == null) {
                            w61Var2.y1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        w61Var2.f0.u0(0);
                        int i11 = w61Var2.T;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    w61Var2.x1.add(ng.q0.c(tL_availableReaction));
                                }
                            } else {
                                w61Var2.x1.addAll(arrayList9);
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                w61Var2.y1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = w61Var2.x1;
                            ng.q0 q0Var = new ng.q0();
                            long longValue = l10.longValue();
                            q0Var.g = longValue;
                            q0Var.h = longValue;
                            arrayList11.add(q0Var);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            w61Var2.x1.add(ng.q0.b((String) it2.next()));
                        }
                        w61Var2.A1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj2 = arrayList12.get(i10);
                            i10++;
                            w61Var2.z1.addAll((ArrayList) obj2);
                        }
                        w61Var2.n0.E(true ^ z12);
                    }
                });
                break;
        }
    }

    public /* synthetic */ wk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = iArr;
        this.f = tL_messages_requestUrlAuth;
        this.g = h3Var;
        this.c = z4;
        this.b = str;
        this.i = urlAuthResult;
        this.j = strArr;
        this.d = z10;
        this.k = a1Var;
        this.h = str2;
        this.l = g6Var;
    }
}

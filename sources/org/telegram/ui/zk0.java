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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements Utilities.Callback {
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

    public /* synthetic */ zk0(z61 z61Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = z61Var;
        this.b = str;
        this.c = z10;
        this.f = arrayList;
        this.g = hashMap;
        this.h = arrayList2;
        this.i = linkedHashSet;
        this.j = linkedHashSet2;
        this.k = arrayList3;
        this.l = arrayList4;
        this.d = z11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.e;
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.g;
                final boolean z10 = this.c;
                final String str = this.b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.i;
                final String[] strArr = (String[]) this.j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.l;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
                    b2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.vk0
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.b2.this.dismiss();
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            if (urlAuthResult2 != null) {
                                f3Var2.dismiss();
                                cl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.ui.Cells.q3.r(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                                    return;
                                }
                                f3Var2.dismiss();
                                org.telegram.ui.Components.xc a2 = cl0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                a2.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var)), i10).j();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final z61 z61Var = (z61) this.e;
                final String str3 = this.b;
                final boolean z12 = this.c;
                final ArrayList arrayList = (ArrayList) this.f;
                final HashMap hashMap = (HashMap) this.g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.j;
                final ArrayList arrayList3 = (ArrayList) this.k;
                final ArrayList arrayList4 = (ArrayList) this.l;
                final boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.j51
                    @Override // java.lang.Runnable
                    public final void run() {
                        z61 z61Var2 = z61.this;
                        c51 c51Var = z61Var2.I1;
                        if (c51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(c51Var);
                            z61Var2.I1 = null;
                        }
                        String str4 = z61Var2.z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        z61Var2.y1 = true;
                        z61Var2.z(true, z12);
                        q51 q51Var = z61Var2.f0;
                        if (q51Var != null) {
                            q51Var.d(true);
                        }
                        ArrayList arrayList5 = z61Var2.A1;
                        if (arrayList5 == null) {
                            z61Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = z61Var2.D1;
                        if (arrayList6 == null) {
                            z61Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = z61Var2.C1;
                        if (arrayList7 == null) {
                            z61Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = z61Var2.B1;
                        if (arrayList8 == null) {
                            z61Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        z61Var2.i0.u0(0);
                        int i11 = z61Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    z61Var2.A1.add(zg.p0.c(tL_availableReaction));
                                }
                            } else {
                                z61Var2.A1.addAll(arrayList9);
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                z61Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = z61Var2.A1;
                            zg.p0 p0Var = new zg.p0();
                            long longValue = l4.longValue();
                            p0Var.g = longValue;
                            p0Var.h = longValue;
                            arrayList11.add(p0Var);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            z61Var2.A1.add(zg.p0.b((String) it2.next()));
                        }
                        z61Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj2 = arrayList12.get(i10);
                            i10++;
                            z61Var2.C1.addAll((ArrayList) obj2);
                        }
                        z61Var2.q0.E(true ^ z13);
                    }
                });
                break;
        }
    }

    public /* synthetic */ zk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = iArr;
        this.f = tL_messages_requestUrlAuth;
        this.g = f3Var;
        this.c = z10;
        this.b = str;
        this.i = urlAuthResult;
        this.j = strArr;
        this.d = z11;
        this.k = b1Var;
        this.h = str2;
        this.l = d6Var;
    }
}

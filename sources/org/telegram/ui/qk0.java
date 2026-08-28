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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk0 implements Utilities.Callback {
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

    public /* synthetic */ qk0(b61 b61Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = b61Var;
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
                final org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.l;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
                    c2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.nk0
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.c2.this.dismiss();
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            if (urlAuthResult2 != null) {
                                f3Var2.dismiss();
                                tk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, y0Var);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.ui.Cells.j2.s(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                                    return;
                                }
                                f3Var2.dismiss();
                                org.telegram.ui.Components.oc a2 = tk0.a();
                                int i9 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                a2.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var)), i9).j();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final b61 b61Var = (b61) this.e;
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.m41
                    @Override // java.lang.Runnable
                    public final void run() {
                        b61 b61Var2 = b61.this;
                        f41 f41Var = b61Var2.E1;
                        if (f41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(f41Var);
                            b61Var2.E1 = null;
                        }
                        String str4 = b61Var2.v1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        b61Var2.u1 = true;
                        b61Var2.z(true, z12);
                        s41 s41Var = b61Var2.b0;
                        if (s41Var != null) {
                            s41Var.e(true);
                        }
                        ArrayList arrayList5 = b61Var2.w1;
                        if (arrayList5 == null) {
                            b61Var2.w1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = b61Var2.z1;
                        if (arrayList6 == null) {
                            b61Var2.z1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = b61Var2.y1;
                        if (arrayList7 == null) {
                            b61Var2.y1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = b61Var2.x1;
                        if (arrayList8 == null) {
                            b61Var2.x1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i9 = 0;
                        b61Var2.e0.u0(0);
                        int i10 = b61Var2.S;
                        if (i10 == 1 || i10 == 14 || i10 == 11 || i10 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    b61Var2.w1.add(hg.r0.c(tL_availableReaction));
                                }
                            } else {
                                b61Var2.w1.addAll(arrayList9);
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                b61Var2.x1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = b61Var2.w1;
                            hg.r0 r0Var = new hg.r0();
                            long longValue = l10.longValue();
                            r0Var.g = longValue;
                            r0Var.h = longValue;
                            arrayList11.add(r0Var);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            b61Var2.w1.add(hg.r0.b((String) it2.next()));
                        }
                        b61Var2.z1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i9 < size) {
                            Object obj2 = arrayList12.get(i9);
                            i9++;
                            b61Var2.y1.addAll((ArrayList) obj2);
                        }
                        b61Var2.m0.E(true ^ z13);
                    }
                });
                break;
        }
    }

    public /* synthetic */ qk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.y0 y0Var, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = iArr;
        this.f = tL_messages_requestUrlAuth;
        this.g = f3Var;
        this.c = z10;
        this.b = str;
        this.i = urlAuthResult;
        this.j = strArr;
        this.d = z11;
        this.k = y0Var;
        this.h = str2;
        this.l = b6Var;
    }
}

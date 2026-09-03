package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u11 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public u11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int b10 = l1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 == i10 || b10 == proxyListActivity.w) {
            return true;
        }
        i11 = proxyListActivity.callsRow;
        if (b10 == i11) {
            return true;
        }
        i12 = proxyListActivity.proxyAddRow;
        if (b10 == i12 || b10 == proxyListActivity.C) {
            return true;
        }
        return b10 >= proxyListActivity.r && b10 < proxyListActivity.s;
    }

    public final void E() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.E.size();
        kVar = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        boolean s6 = kVar.s();
        if (size <= 0) {
            if (s6) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
                kVar2.r();
                int i10 = proxyListActivity.r;
                r(i10, proxyListActivity.s - i10, 2);
                return;
            }
            return;
        }
        proxyListActivity.D.a(size, s6);
        if (s6) {
            return;
        }
        kVar3 = ((org.telegram.ui.ActionBar.p2) proxyListActivity).actionBar;
        kVar3.O(null, null);
        int i11 = proxyListActivity.r;
        r(i11, proxyListActivity.s - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.r;
        r(i10, proxyListActivity.s - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.r;
        if (i10 < i11 || i10 >= proxyListActivity.s) {
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - i11);
        if (arrayList.contains(proxyInfo)) {
            arrayList.remove(proxyInfo);
        } else {
            arrayList.add(proxyInfo);
        }
        n(i10, 1);
        E();
    }

    @Override // f2.o0
    public final int h() {
        return this.d.f;
    }

    @Override // f2.o0
    public final long i(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h) {
            return -1L;
        }
        if (i10 == proxyListActivity.v) {
            return -2L;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11) {
            return -3L;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12) {
            return -4L;
        }
        i13 = proxyListActivity.callsRow;
        if (i10 == i13) {
            return -5L;
        }
        if (i10 == proxyListActivity.n) {
            return -6L;
        }
        if (i10 == proxyListActivity.C) {
            return -8L;
        }
        if (i10 == proxyListActivity.w) {
            return -9L;
        }
        if (i10 == proxyListActivity.x) {
            return -10L;
        }
        if (i10 == proxyListActivity.y) {
            return -11L;
        }
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - r1)).hashCode();
    }

    @Override // f2.o0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.h || i10 == proxyListActivity.v) {
            return 0;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11 || i10 == proxyListActivity.C) {
            return 1;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12 || i10 == proxyListActivity.w) {
            return 3;
        }
        i13 = proxyListActivity.callsRow;
        if (i10 == i13) {
            return 3;
        }
        if (i10 == proxyListActivity.n) {
            return 2;
        }
        if (i10 == proxyListActivity.x) {
            return 6;
        }
        return (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) ? 4 : 5;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i14 = l1Var.f;
        View view = l1Var.a;
        switch (i14) {
            case 1:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    z9Var.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.C != -1);
                    break;
                } else if (i10 == proxyListActivity.C) {
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    z9Var.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == proxyListActivity.n) {
                    l4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    r8Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else {
                    i13 = proxyListActivity.callsRow;
                    if (i10 == i13) {
                        r8Var.f(LocaleController.getString(R.string.UseProxyForCalls), proxyListActivity.e, false);
                        break;
                    } else if (i10 == proxyListActivity.w) {
                        r8Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == proxyListActivity.B) {
                    z8Var.setText(LocaleController.getString(R.string.UseProxyForCallsInfo));
                    break;
                } else if (i10 == proxyListActivity.y) {
                    z8Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                v11 v11Var = (v11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.r);
                v11Var.setProxy(proxyInfo);
                v11Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.r));
                v11Var.h = contains;
                v11Var.f.a(contains, false);
                v11Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.x) {
                    org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        strArr[i15] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i15));
                    }
                    uv0Var.setCallback(new cl0(7));
                    uv0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final void w(f2.l1 l1Var, int i10, List list) {
        int i11;
        int i12;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 5 && !list.isEmpty()) {
            v11 v11Var = (v11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.r))) != v11Var.h) {
                v11Var.h = contains;
                v11Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                v11Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (l1Var.f != 3 || !list.contains(0)) {
            v(l1Var, i10);
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            r8Var.setChecked(proxyListActivity.d);
            return;
        }
        i12 = proxyListActivity.callsRow;
        if (i10 == i12) {
            r8Var.setChecked(proxyListActivity.e);
        } else if (i10 == proxyListActivity.w) {
            r8Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View y6Var;
        Context context = this.c;
        if (i10 == 0) {
            y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        } else if (i10 == 1) {
            y6Var = new org.telegram.ui.Cells.z9(context);
            y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 2) {
            y6Var = new org.telegram.ui.Cells.l4(context);
            y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 3) {
            y6Var = new org.telegram.ui.Cells.r8(context);
            y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else if (i10 == 4) {
            y6Var = new org.telegram.ui.Cells.z8(context);
        } else if (i10 != 6) {
            y6Var = new v11(this.d, context);
            y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        } else {
            y6Var = new org.telegram.ui.Components.uv0(context, null);
            y6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        return ai.n(y6Var, y6Var, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11;
        if (l1Var.f == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) l1Var.a;
            int b10 = l1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                r8Var.setChecked(proxyListActivity.d);
                return;
            }
            i11 = proxyListActivity.callsRow;
            if (b10 == i11) {
                r8Var.setChecked(proxyListActivity.e);
            } else if (b10 == proxyListActivity.w) {
                r8Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}

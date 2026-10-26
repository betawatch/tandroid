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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r11 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ ProxyListActivity d;

    public r11(ProxyListActivity proxyListActivity, Context context) {
        this.d = proxyListActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int b10 = e1Var.b();
        ProxyListActivity proxyListActivity = this.d;
        i10 = proxyListActivity.useProxyRow;
        if (b10 == i10 || b10 == proxyListActivity.v) {
            return true;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (b10 == i11 || b10 == proxyListActivity.y) {
            return true;
        }
        return b10 >= proxyListActivity.n && b10 < proxyListActivity.r;
    }

    public final void E() {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4;
        ProxyListActivity proxyListActivity = this.d;
        int size = proxyListActivity.E.size();
        r5Var = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
        boolean o10 = r5Var.o();
        if (size <= 0) {
            if (o10) {
                r5Var2 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
                r5Var2.n();
                int i10 = proxyListActivity.n;
                r(i10, proxyListActivity.r - i10, 2);
                return;
            }
            return;
        }
        r5Var3 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
        r5Var3.t(size, o10);
        if (o10) {
            return;
        }
        r5Var4 = ((org.telegram.ui.ActionBar.r2) proxyListActivity).simpleActionBar;
        r5Var4.x();
        int i11 = proxyListActivity.n;
        r(i11, proxyListActivity.r - i11, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = this.d;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.n;
        r(i10, proxyListActivity.r - i10, 1);
        E();
    }

    public final void G(int i10) {
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.n;
        if (i10 < i11 || i10 >= proxyListActivity.r) {
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

    @Override // s4.h0
    public final int h() {
        return this.d.e;
    }

    @Override // s4.h0
    public final long i(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f) {
            return -1L;
        }
        if (i10 == proxyListActivity.s) {
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
        if (i10 == proxyListActivity.h) {
            return -6L;
        }
        if (i10 == proxyListActivity.y) {
            return -8L;
        }
        if (i10 == proxyListActivity.v) {
            return -9L;
        }
        if (i10 == proxyListActivity.w) {
            return -10L;
        }
        if (i10 == proxyListActivity.x) {
            return -11L;
        }
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return -7L;
        }
        return ((SharedConfig.ProxyInfo) proxyListActivity.F.get(i10 - r1)).hashCode();
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        if (i10 == proxyListActivity.f || i10 == proxyListActivity.s) {
            return 0;
        }
        i11 = proxyListActivity.proxyAddRow;
        if (i10 == i11 || i10 == proxyListActivity.y) {
            return 1;
        }
        i12 = proxyListActivity.useProxyRow;
        if (i10 == i12 || i10 == proxyListActivity.v) {
            return 3;
        }
        if (i10 == proxyListActivity.h) {
            return 2;
        }
        if (i10 == proxyListActivity.w) {
            return 6;
        }
        return (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) ? 4 : 5;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i13 = e1Var.f;
        View view = e1Var.a;
        switch (i13) {
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
                i11 = proxyListActivity.proxyAddRow;
                if (i10 == i11) {
                    gaVar.b(LocaleController.getString(R.string.AddProxy), proxyListActivity.y != -1);
                    break;
                } else if (i10 == proxyListActivity.y) {
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                    gaVar.b(LocaleController.getString(R.string.DeleteAllProxies), false);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == proxyListActivity.h) {
                    q4Var.setText(LocaleController.getString(R.string.ProxyConnections));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                i12 = proxyListActivity.useProxyRow;
                if (i10 == i12) {
                    a9Var.f(LocaleController.getString(R.string.UseProxySettings), proxyListActivity.d, proxyListActivity.v != -1);
                    break;
                } else if (i10 == proxyListActivity.v) {
                    a9Var.f(LocaleController.getString(R.string.UseProxyRotation), SharedConfig.proxyRotationEnabled, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == proxyListActivity.x) {
                    i9Var.setText(LocaleController.getString(R.string.ProxyRotationTimeoutInfo));
                    break;
                }
                break;
            case 5:
                s11 s11Var = (s11) view;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList2.get(i10 - proxyListActivity.n);
                s11Var.setProxy(proxyInfo);
                s11Var.setChecked(SharedConfig.currentProxy == proxyInfo);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.n));
                s11Var.h = contains;
                s11Var.f.a(contains, false);
                s11Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i10 == proxyListActivity.w) {
                    org.telegram.ui.Components.zw0 zw0Var = (org.telegram.ui.Components.zw0) view;
                    ArrayList arrayList3 = new ArrayList(ProxyRotationController.ROTATION_TIMEOUTS);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        strArr[i14] = LocaleController.formatString(R.string.ProxyRotationTimeoutSeconds, arrayList3.get(i14));
                    }
                    zw0Var.setCallback(new org.telegram.ui.Components.voip.c1(21));
                    zw0Var.b(SharedConfig.proxyRotationTimeout, null, strArr);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final void w(s4.e1 e1Var, int i10, List list) {
        int i11;
        boolean contains;
        ProxyListActivity proxyListActivity = this.d;
        ArrayList arrayList = proxyListActivity.E;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 5 && !list.isEmpty()) {
            s11 s11Var = (s11) view;
            if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.n))) != s11Var.h) {
                s11Var.h = contains;
                s11Var.f.a(contains, true);
            }
            if (list.contains(2)) {
                s11Var.a(!arrayList.isEmpty(), true);
                return;
            }
            return;
        }
        if (e1Var.f != 3 || !list.contains(0)) {
            v(e1Var, i10);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        i11 = proxyListActivity.useProxyRow;
        if (i10 == i11) {
            a9Var.setChecked(proxyListActivity.d);
        } else if (i10 == proxyListActivity.v) {
            a9Var.setChecked(SharedConfig.proxyRotationEnabled);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        Context context = this.c;
        if (i10 == 0) {
            f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        } else if (i10 == 1) {
            f7Var = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f7Var, null);
        } else if (i10 == 2) {
            f7Var = new org.telegram.ui.Cells.q4(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f7Var, null);
        } else if (i10 == 3) {
            f7Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f7Var, null);
        } else if (i10 == 4) {
            f7Var = new org.telegram.ui.Cells.i9(context);
        } else if (i10 != 6) {
            f7Var = new s11(this.d, context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f7Var, null);
        } else {
            f7Var = new org.telegram.ui.Components.zw0(context, null);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f7Var, null);
        }
        return ic.a.n(f7Var, f7Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int i10;
        if (e1Var.f == 3) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.a;
            int b10 = e1Var.b();
            ProxyListActivity proxyListActivity = this.d;
            i10 = proxyListActivity.useProxyRow;
            if (b10 == i10) {
                a9Var.setChecked(proxyListActivity.d);
            } else if (b10 == proxyListActivity.v) {
                a9Var.setChecked(SharedConfig.proxyRotationEnabled);
            }
        }
    }
}

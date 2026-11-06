package org.telegram.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y21 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public y21(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int i10;
        int b10 = d1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i7 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i7) {
            return true;
        }
        if (b10 >= sessionsActivity.J && b10 < sessionsActivity.K) {
            return true;
        }
        if (b10 >= sessionsActivity.L && b10 < sessionsActivity.M) {
            return true;
        }
        if ((b10 >= sessionsActivity.F && b10 < sessionsActivity.G) || b10 == sessionsActivity.y) {
            return true;
        }
        i10 = sessionsActivity.ttlRow;
        return b10 == i10;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.R;
    }

    @Override // v4.g0
    public final long c(int i7) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i7 == sessionsActivity.D) {
            hash = Objects.hash(0, 1);
        } else if (i7 == sessionsActivity.N) {
            hash = Objects.hash(0, 2);
        } else if (i7 == sessionsActivity.H) {
            hash = Objects.hash(0, 3);
        } else if (i7 == sessionsActivity.Q) {
            hash = Objects.hash(0, 4);
        } else if (i7 == sessionsActivity.T) {
            hash = Objects.hash(0, 5);
        } else if (i7 == sessionsActivity.O) {
            hash = Objects.hash(0, 6);
        } else if (i7 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i7 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i7 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i7 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i7 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.J;
            if (i7 < i12 || i7 >= sessionsActivity.K) {
                int i13 = sessionsActivity.L;
                if (i7 < i13 || i7 >= sessionsActivity.M) {
                    int i14 = sessionsActivity.F;
                    if (i7 >= i14 && i7 < sessionsActivity.G) {
                        TLObject tLObject = (TLObject) sessionsActivity.e.get(i7 - i14);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i7 == sessionsActivity.P) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i11 = sessionsActivity.ttlRow;
                        if (i7 == i11) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f.get(i7 - i13)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.d.get(i7 - i12);
                if (tLObject2 instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            }
        }
        return hash;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            return 0;
        }
        if (i7 == sessionsActivity.D || i7 == sessionsActivity.N || i7 == sessionsActivity.H || i7 == sessionsActivity.Q || i7 == sessionsActivity.T || i7 == sessionsActivity.O) {
            return 1;
        }
        if (i7 == sessionsActivity.x || i7 == sessionsActivity.I || i7 == sessionsActivity.E || i7 == sessionsActivity.S) {
            return 2;
        }
        if (i7 == sessionsActivity.y) {
            return 4;
        }
        if (i7 >= sessionsActivity.J && i7 < sessionsActivity.K) {
            return 4;
        }
        if (i7 >= sessionsActivity.L && i7 < sessionsActivity.M) {
            return 4;
        }
        if (i7 >= sessionsActivity.F && i7 < sessionsActivity.G) {
            return 4;
        }
        if (i7 == sessionsActivity.P) {
            return 5;
        }
        i11 = sessionsActivity.ttlRow;
        return i7 == i11 ? 6 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11 = d1Var.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) d1Var.a;
            i10 = this.d.terminateAllSessionsRow;
            if (i7 != i10) {
                if (i7 == this.d.P) {
                    int i12 = org.telegram.ui.ActionBar.k6.q6;
                    m8Var.g(i12, i12);
                    m8Var.setTag(Integer.valueOf(i12));
                    m8Var.o(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131753894, null), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i13 = org.telegram.ui.ActionBar.k6.p7;
            m8Var.g(i13, i13);
            m8Var.setTag(Integer.valueOf(i13));
            if (this.d.w == 0) {
                m8Var.o(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131744209, null), false);
                return;
            } else {
                m8Var.o(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131744208, null), false);
                return;
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.a;
            z8Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i7 == sessionsActivity.D) {
                if (sessionsActivity.w == 0) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131752074, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131752073, null));
                    return;
                }
            }
            if (i7 == sessionsActivity.N) {
                if (sessionsActivity.w != 0) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131744204, null));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    z8Var.setText("");
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131745555, null));
                    return;
                }
            }
            if (i7 == sessionsActivity.H) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131748737, null));
                return;
            } else {
                if (i7 == sessionsActivity.Q || i7 == sessionsActivity.T || i7 == sessionsActivity.O) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) d1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i7 == sessionsActivity2.x) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131751694, null));
                return;
            }
            if (i7 == sessionsActivity2.I) {
                if (sessionsActivity2.w == 0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131747765, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131747762, null));
                    return;
                }
            }
            if (i7 == sessionsActivity2.E) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131748738, null));
                return;
            } else {
                if (i7 == sessionsActivity2.S) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131744207, null));
                    return;
                }
                return;
            }
        }
        if (i11 != 5) {
            if (i11 == 6) {
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.a;
                int i14 = this.d.s;
                w9Var.c(org.telegram.messenger.hd.M0(2131749271, null), (i14 <= 30 || i14 > 183) ? i14 == 365 ? org.telegram.messenger.hd.G(i14 / 365, "Years", new Object[0]) : org.telegram.messenger.hd.G(i14 / 7, "Weeks", new Object[0]) : org.telegram.messenger.hd.G(i14 / 30, "Months", new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) d1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i7 != sessionsActivity3.y) {
                int i15 = sessionsActivity3.J;
                if (i7 >= i15 && i7 < sessionsActivity3.K) {
                    s6Var.c((TLObject) sessionsActivity3.d.get(i7 - i15), i7 != this.d.K - 1);
                    return;
                }
                int i16 = sessionsActivity3.L;
                if (i7 < i16 || i7 >= sessionsActivity3.M) {
                    int i17 = sessionsActivity3.F;
                    if (i7 < i17 || i7 >= sessionsActivity3.G) {
                        return;
                    }
                    s6Var.c((TLObject) sessionsActivity3.e.get(i7 - i17), i7 != this.d.G - 1);
                    return;
                }
                int i18 = i7 - i16;
                ArrayList arrayList = sessionsActivity3.f;
                if (arrayList == null || i18 < 0 || i18 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i18);
                SessionsActivity sessionsActivity4 = this.d;
                if (i7 != sessionsActivity4.M - 1 && i7 != sessionsActivity4.K - 1) {
                    r1 = true;
                }
                s6Var.c(tL_connectedBot, r1);
                return;
            }
            TLRPC.TL_authorization tL_authorization = sessionsActivity3.h;
            if (tL_authorization == null) {
                tL_authorization = new TLRPC.TL_authorization();
                tL_authorization.flags = 1;
                tL_authorization.current = true;
                tL_authorization.platform = "Android";
                tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                StringBuilder sb2 = new StringBuilder("SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                tL_authorization.system_version = sb2.toString();
                tL_authorization.app_name = "Telegram Android";
                tL_authorization.app_version = "";
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    boolean z9 = org.telegram.messenger.r2.a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_version);
                    sb3.append(" beta");
                    tL_authorization.app_version = sb3.toString();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                tL_authorization.country = "";
                tL_authorization.region = "";
                tL_authorization.ip = "";
            }
            s6Var.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.P == -1) ? false : true);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.m8(context);
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        } else if (i7 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i7 == 5) {
                frameLayout = new z21(sessionsActivity, context);
            } else if (i7 != 6) {
                int i10 = sessionsActivity.w;
                org.telegram.ui.Cells.s6 s6Var = new org.telegram.ui.Cells.s6(context);
                s6Var.s = new org.telegram.ui.Components.w5(s6Var);
                s6Var.x = org.telegram.messenger.p10.s0;
                LinearLayout linearLayout = new LinearLayout(context);
                s6Var.w = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                s6Var.a = i10;
                int i11 = 21;
                if (i10 == 1) {
                    boolean z9 = org.telegram.messenger.hd.a0;
                    s6Var.addView(linearLayout, c8.ha.d(-1, 30.0f, (z9 ? 5 : 3) | 48, z9 ? 15 : 49, 11.0f, z9 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    s6Var.n = w8Var;
                    w8Var.u(org.telegram.messenger.g0.L(10.0f));
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                    s6Var.h = l9Var;
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z10 = org.telegram.messenger.hd.a0;
                    s6Var.addView(l9Var, c8.ha.d(20, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 21, 13.0f, z10 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                    s6Var.f = l9Var2;
                    l9Var2.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z11 = org.telegram.messenger.hd.a0;
                    s6Var.addView(l9Var2, c8.ha.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 16, 9.0f, z11 ? 16 : 0, 0.0f));
                    s6Var.n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    org.telegram.ui.Components.l9 l9Var3 = new org.telegram.ui.Components.l9(context);
                    s6Var.h = l9Var3;
                    l9Var3.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z12 = org.telegram.messenger.hd.a0;
                    s6Var.addView(l9Var3, c8.ha.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    boolean z13 = org.telegram.messenger.hd.a0;
                    s6Var.addView(linearLayout, c8.ha.d(-1, 30.0f, (z13 ? 5 : 3) | 48, z13 ? 15 : 72, 6.333f, z13 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                s6Var.b = textView;
                int i12 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(textView, i12, null);
                textView.setTextSize(1, i10 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                s6Var.c = textView2;
                textView2.setTextSize(1, i10 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 48);
                if (org.telegram.messenger.hd.a0) {
                    linearLayout.addView(textView2, c8.ha.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, c8.ha.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, c8.ha.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, c8.ha.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!org.telegram.messenger.hd.a0) {
                    i11 = i10 != 0 ? 21 : 72;
                    r8 = 21;
                } else if (i10 != 0) {
                    r8 = 21;
                }
                TextView textView3 = new TextView(context);
                s6Var.d = textView3;
                org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
                org.telegram.messenger.camera.q.n(textView3, 1, i10 == 0 ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                float f10 = i11;
                float f11 = r8;
                s6Var.addView(textView3, c8.ha.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, f10, i10 == 0 ? 28.0f : 36.0f, f11, 0.0f));
                TextView textView4 = new TextView(context);
                s6Var.e = textView4;
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.A6, null);
                org.telegram.messenger.camera.q.n(textView4, 1, i10 != 0 ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                s6Var.addView(textView4, c8.ha.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, f10, i10 == 0 ? 46.0f : 59.0f, f11, 0.0f));
                frameLayout = s6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.w9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}

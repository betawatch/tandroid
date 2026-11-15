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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v21 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public v21(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7;
        int i10;
        int b10 = e1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i7 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i7) {
            return true;
        }
        if (b10 >= sessionsActivity.K && b10 < sessionsActivity.L) {
            return true;
        }
        if (b10 >= sessionsActivity.M && b10 < sessionsActivity.N) {
            return true;
        }
        if ((b10 >= sessionsActivity.G && b10 < sessionsActivity.H) || b10 == sessionsActivity.y) {
            return true;
        }
        i10 = sessionsActivity.ttlRow;
        return b10 == i10;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.S;
    }

    @Override // v4.h0
    public final long c(int i7) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i7 == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i7 == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i7 == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i7 == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i7 == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i7 == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i7 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i7 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i7 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i7 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i7 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.K;
            if (i7 < i12 || i7 >= sessionsActivity.L) {
                int i13 = sessionsActivity.M;
                if (i7 < i13 || i7 >= sessionsActivity.N) {
                    int i14 = sessionsActivity.G;
                    if (i7 >= i14 && i7 < sessionsActivity.H) {
                        TLObject tLObject = (TLObject) sessionsActivity.e.get(i7 - i14);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i7 == sessionsActivity.Q) {
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

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i7 == i10) {
            return 0;
        }
        if (i7 == sessionsActivity.E || i7 == sessionsActivity.O || i7 == sessionsActivity.I || i7 == sessionsActivity.R || i7 == sessionsActivity.U || i7 == sessionsActivity.P) {
            return 1;
        }
        if (i7 == sessionsActivity.x || i7 == sessionsActivity.J || i7 == sessionsActivity.F || i7 == sessionsActivity.T) {
            return 2;
        }
        if (i7 == sessionsActivity.y) {
            return 4;
        }
        if (i7 >= sessionsActivity.K && i7 < sessionsActivity.L) {
            return 4;
        }
        if (i7 >= sessionsActivity.M && i7 < sessionsActivity.N) {
            return 4;
        }
        if (i7 >= sessionsActivity.G && i7 < sessionsActivity.H) {
            return 4;
        }
        if (i7 == sessionsActivity.Q) {
            return 5;
        }
        i11 = sessionsActivity.ttlRow;
        return i7 == i11 ? 6 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11 = e1Var.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) e1Var.a;
            i10 = this.d.terminateAllSessionsRow;
            if (i7 != i10) {
                if (i7 == this.d.Q) {
                    int i12 = org.telegram.ui.ActionBar.j6.q6;
                    l8Var.g(i12, i12);
                    l8Var.setTag(Integer.valueOf(i12));
                    l8Var.o(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131753894, null), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i13 = org.telegram.ui.ActionBar.j6.p7;
            l8Var.g(i13, i13);
            l8Var.setTag(Integer.valueOf(i13));
            if (this.d.w == 0) {
                l8Var.o(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131744208, null), false);
                return;
            } else {
                l8Var.o(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131744207, null), false);
                return;
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) e1Var.a;
            y8Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i7 == sessionsActivity.E) {
                if (sessionsActivity.w == 0) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131752074, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131752073, null));
                    return;
                }
            }
            if (i7 == sessionsActivity.O) {
                if (sessionsActivity.w != 0) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131744203, null));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    y8Var.setText("");
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131745554, null));
                    return;
                }
            }
            if (i7 == sessionsActivity.I) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131748738, null));
                return;
            } else {
                if (i7 == sessionsActivity.R || i7 == sessionsActivity.U || i7 == sessionsActivity.P) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) e1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i7 == sessionsActivity2.x) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131751693, null));
                return;
            }
            if (i7 == sessionsActivity2.J) {
                if (sessionsActivity2.w == 0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131747766, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131747763, null));
                    return;
                }
            }
            if (i7 == sessionsActivity2.F) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131748739, null));
                return;
            } else {
                if (i7 == sessionsActivity2.T) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131744206, null));
                    return;
                }
                return;
            }
        }
        if (i11 != 5) {
            if (i11 == 6) {
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.a;
                int i14 = this.d.s;
                v9Var.c(org.telegram.messenger.hd.M0(2131749272, null), (i14 <= 30 || i14 > 183) ? i14 == 365 ? org.telegram.messenger.hd.G(i14 / 365, "Years", new Object[0]) : org.telegram.messenger.hd.G(i14 / 7, "Weeks", new Object[0]) : org.telegram.messenger.hd.G(i14 / 30, "Months", new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.r6 r6Var = (org.telegram.ui.Cells.r6) e1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i7 != sessionsActivity3.y) {
                int i15 = sessionsActivity3.K;
                if (i7 >= i15 && i7 < sessionsActivity3.L) {
                    r6Var.c((TLObject) sessionsActivity3.d.get(i7 - i15), i7 != this.d.L - 1);
                    return;
                }
                int i16 = sessionsActivity3.M;
                if (i7 < i16 || i7 >= sessionsActivity3.N) {
                    int i17 = sessionsActivity3.G;
                    if (i7 < i17 || i7 >= sessionsActivity3.H) {
                        return;
                    }
                    r6Var.c((TLObject) sessionsActivity3.e.get(i7 - i17), i7 != this.d.H - 1);
                    return;
                }
                int i18 = i7 - i16;
                ArrayList arrayList = sessionsActivity3.f;
                if (arrayList == null || i18 < 0 || i18 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i18);
                SessionsActivity sessionsActivity4 = this.d;
                if (i7 != sessionsActivity4.N - 1 && i7 != sessionsActivity4.L - 1) {
                    r1 = true;
                }
                r6Var.c(tL_connectedBot, r1);
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
                    boolean z10 = org.telegram.messenger.r2.a;
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
            r6Var.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.Q == -1) ? false : true);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.l8(context);
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        } else if (i7 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i7 == 5) {
                frameLayout = new w21(sessionsActivity, context);
            } else if (i7 != 6) {
                int i10 = sessionsActivity.w;
                org.telegram.ui.Cells.r6 r6Var = new org.telegram.ui.Cells.r6(context);
                r6Var.s = new org.telegram.ui.Components.u5(r6Var);
                r6Var.x = org.telegram.messenger.m10.t0;
                LinearLayout linearLayout = new LinearLayout(context);
                r6Var.w = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                r6Var.a = i10;
                int i11 = 21;
                if (i10 == 1) {
                    boolean z10 = org.telegram.messenger.hd.a0;
                    r6Var.addView(linearLayout, c8.ja.d(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    r6Var.n = t8Var;
                    t8Var.u(org.telegram.messenger.g0.L(10.0f));
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                    r6Var.h = i9Var;
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z11 = org.telegram.messenger.hd.a0;
                    r6Var.addView(i9Var, c8.ja.d(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                    r6Var.f = i9Var2;
                    i9Var2.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z12 = org.telegram.messenger.hd.a0;
                    r6Var.addView(i9Var2, c8.ja.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    r6Var.n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(context);
                    r6Var.h = i9Var3;
                    i9Var3.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    boolean z13 = org.telegram.messenger.hd.a0;
                    r6Var.addView(i9Var3, c8.ja.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = org.telegram.messenger.hd.a0;
                    r6Var.addView(linearLayout, c8.ja.d(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                r6Var.b = textView;
                int i12 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.U(textView, i12, null);
                textView.setTextSize(1, i10 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                r6Var.c = textView2;
                textView2.setTextSize(1, i10 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 48);
                if (org.telegram.messenger.hd.a0) {
                    linearLayout.addView(textView2, c8.ja.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, c8.ja.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, c8.ja.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, c8.ja.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!org.telegram.messenger.hd.a0) {
                    i11 = i10 != 0 ? 21 : 72;
                    r8 = 21;
                } else if (i10 != 0) {
                    r8 = 21;
                }
                TextView textView3 = new TextView(context);
                r6Var.d = textView3;
                org.telegram.ui.ActionBar.q6.U(textView3, i12, null);
                org.telegram.messenger.i20.p(textView3, 1, i10 == 0 ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                float f10 = i11;
                float f11 = r8;
                r6Var.addView(textView3, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, f10, i10 == 0 ? 28.0f : 36.0f, f11, 0.0f));
                TextView textView4 = new TextView(context);
                r6Var.e = textView4;
                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.A6, null);
                org.telegram.messenger.i20.p(textView4, 1, i10 != 0 ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                r6Var.addView(textView4, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, f10, i10 == 0 ? 46.0f : 59.0f, f11, 0.0f));
                frameLayout = r6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.v9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}

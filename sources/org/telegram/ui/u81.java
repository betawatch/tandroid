package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u81 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public u81(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10;
        int i11;
        int b10 = d1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i10) {
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
        i11 = sessionsActivity.ttlRow;
        return b10 == i11;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.S;
    }

    @Override // s4.i0
    public final long i(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.R) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.U) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.P) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.J) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.F) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.K;
            if (i10 < i13 || i10 >= sessionsActivity.L) {
                int i14 = sessionsActivity.M;
                if (i10 < i14 || i10 >= sessionsActivity.N) {
                    int i15 = sessionsActivity.G;
                    if (i10 >= i15 && i10 < sessionsActivity.H) {
                        TLObject tLObject = (TLObject) sessionsActivity.f.get(i10 - i15);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 == sessionsActivity.Q) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i10 - i14)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i10 - i13);
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

    @Override // s4.i0
    public final int j(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == sessionsActivity.E || i10 == sessionsActivity.O || i10 == sessionsActivity.I || i10 == sessionsActivity.R || i10 == sessionsActivity.U || i10 == sessionsActivity.P) {
            return 1;
        }
        if (i10 == sessionsActivity.x || i10 == sessionsActivity.J || i10 == sessionsActivity.F || i10 == sessionsActivity.T) {
            return 2;
        }
        if (i10 == sessionsActivity.y) {
            return 4;
        }
        if (i10 >= sessionsActivity.K && i10 < sessionsActivity.L) {
            return 4;
        }
        if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
            return 4;
        }
        if (i10 >= sessionsActivity.G && i10 < sessionsActivity.H) {
            return 4;
        }
        if (i10 == sessionsActivity.Q) {
            return 5;
        }
        i12 = sessionsActivity.ttlRow;
        return i10 == i12 ? 6 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12 = d1Var.f;
        if (i12 == 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) d1Var.a;
            i11 = this.d.terminateAllSessionsRow;
            if (i10 != i11) {
                if (i10 == this.d.Q) {
                    int i13 = org.telegram.ui.ActionBar.i6.q6;
                    r8Var.e(i13, i13);
                    r8Var.setTag(Integer.valueOf(i13));
                    r8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.e.isEmpty());
                    return;
                }
                return;
            }
            int i14 = org.telegram.ui.ActionBar.i6.p7;
            r8Var.e(i14, i14);
            r8Var.setTag(Integer.valueOf(i14));
            if (this.d.w == 0) {
                r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            } else {
                r8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) d1Var.a;
            e9Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i10 == sessionsActivity.E) {
                if (sessionsActivity.w == 0) {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            }
            if (i10 == sessionsActivity.O) {
                if (sessionsActivity.w != 0) {
                    e9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                    return;
                } else if (sessionsActivity.e.isEmpty()) {
                    e9Var.setText("");
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                    return;
                }
            }
            if (i10 == sessionsActivity.I) {
                e9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else {
                if (i10 == sessionsActivity.R || i10 == sessionsActivity.U || i10 == sessionsActivity.P) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) d1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i10 == sessionsActivity2.x) {
                m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                return;
            }
            if (i10 == sessionsActivity2.J) {
                if (sessionsActivity2.w == 0) {
                    m4Var.setText(LocaleController.getString(R.string.OtherSessions));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                    return;
                }
            }
            if (i10 == sessionsActivity2.F) {
                m4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                return;
            } else {
                if (i10 == sessionsActivity2.T) {
                    m4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                }
                return;
            }
        }
        if (i12 != 5) {
            if (i12 == 6) {
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.a;
                int i15 = this.d.v;
                caVar.c(LocaleController.getString(R.string.IfInactiveFor), (i15 <= 30 || i15 > 183) ? i15 == 365 ? LocaleController.formatPluralString("Years", i15 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i15 / 7, new Object[0]) : LocaleController.formatPluralString("Months", i15 / 30, new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) d1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i10 == sessionsActivity3.y) {
                TLRPC.TL_authorization tL_authorization = sessionsActivity3.n;
                if (tL_authorization != null) {
                    v6Var.c(tL_authorization, (sessionsActivity3.e.isEmpty() && this.d.f.isEmpty() && this.d.Q == -1) ? false : true);
                    return;
                }
                v6Var.w = sessionsActivity3.d;
                v6Var.s = true;
                Drawable mutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J7, false), PorterDuff.Mode.SRC_IN));
                org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.R7, false)), mutate);
                org.telegram.ui.Components.y9 y9Var = v6Var.f;
                if (y9Var != null) {
                    y9Var.setImageDrawable(frVar);
                } else {
                    v6Var.h.setImageDrawable(frVar);
                }
                v6Var.invalidate();
                return;
            }
            int i16 = sessionsActivity3.K;
            if (i10 >= i16 && i10 < sessionsActivity3.L) {
                v6Var.c((TLObject) sessionsActivity3.e.get(i10 - i16), i10 != this.d.L - 1);
                return;
            }
            int i17 = sessionsActivity3.M;
            if (i10 < i17 || i10 >= sessionsActivity3.N) {
                int i18 = sessionsActivity3.G;
                if (i10 < i18 || i10 >= sessionsActivity3.H) {
                    return;
                }
                v6Var.c((TLObject) sessionsActivity3.f.get(i10 - i18), i10 != this.d.H - 1);
                return;
            }
            int i19 = i10 - i17;
            ArrayList arrayList = sessionsActivity3.h;
            if (arrayList == null || i19 < 0 || i19 >= arrayList.size()) {
                return;
            }
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i19);
            SessionsActivity sessionsActivity4 = this.d;
            if (i10 != sessionsActivity4.N - 1 && i10 != sessionsActivity4.L - 1) {
                r1 = true;
            }
            v6Var.c(tL_connectedBot, r1);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.r8(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i10 == 5) {
                frameLayout = new v81(sessionsActivity, context);
            } else if (i10 != 6) {
                int i12 = sessionsActivity.w;
                org.telegram.ui.Cells.v6 v6Var = new org.telegram.ui.Cells.v6(context);
                v6Var.v = new org.telegram.ui.Components.g6(v6Var);
                v6Var.y = UserConfig.selectedAccount;
                LinearLayout linearLayout = new LinearLayout(context);
                v6Var.x = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                v6Var.a = i12;
                int i13 = 21;
                if (i12 == 1) {
                    boolean z10 = LocaleController.isRTL;
                    v6Var.addView(linearLayout, w7.x5.a(30.0f, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f, -1, (z10 ? 5 : 3) | 48));
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                    v6Var.n = j9Var;
                    j9Var.u(AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    v6Var.h = y9Var;
                    y9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z11 = LocaleController.isRTL;
                    v6Var.addView(y9Var, w7.x5.a(20.0f, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f, 20, (z11 ? 5 : 3) | 48));
                } else {
                    org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                    v6Var.f = y9Var2;
                    y9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z12 = LocaleController.isRTL;
                    v6Var.addView(y9Var2, w7.x5.a(42.0f, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f, 42, (z12 ? 5 : 3) | 48));
                    v6Var.n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                    org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                    v6Var.h = y9Var3;
                    y9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z13 = LocaleController.isRTL;
                    v6Var.addView(y9Var3, w7.x5.a(42.0f, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f, 42, (z13 ? 5 : 3) | 48));
                    boolean z14 = LocaleController.isRTL;
                    v6Var.addView(linearLayout, w7.x5.a(30.0f, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f, -1, (z14 ? 5 : 3) | 48));
                }
                TextView textView = new TextView(context);
                v6Var.b = textView;
                int i14 = org.telegram.ui.ActionBar.i6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                textView.setTextSize(1, i12 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                v6Var.c = textView2;
                textView2.setTextSize(1, i12 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                if (LocaleController.isRTL) {
                    linearLayout.addView(textView2, w7.x5.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, w7.x5.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, w7.x5.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, w7.x5.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (LocaleController.isRTL) {
                    i11 = i12 == 0 ? 72 : 21;
                } else {
                    i13 = i12 == 0 ? 72 : 21;
                    i11 = 21;
                }
                TextView textView3 = new TextView(context);
                v6Var.d = textView3;
                textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                textView3.setTextSize(1, i12 == 0 ? 13.0f : 14.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                float f7 = i13;
                float f10 = i11;
                v6Var.addView(textView3, w7.x5.a(-2.0f, f7, i12 == 0 ? 28.0f : 36.0f, f10, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
                TextView textView4 = new TextView(context);
                v6Var.e = textView4;
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A6, false));
                textView4.setTextSize(1, i12 != 0 ? 14.0f : 13.0f);
                textView4.setLines(1);
                textView4.setMaxLines(1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                v6Var.addView(textView4, w7.x5.a(-2.0f, f7, i12 == 0 ? 46.0f : 59.0f, f10, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
                frameLayout = v6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.ca(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }
}

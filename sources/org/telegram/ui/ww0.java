package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ww0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ yw0 d;

    public ww0(yw0 yw0Var, Context context) {
        this.d = yw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        yw0 yw0Var = this.d;
        if (b10 == yw0Var.G) {
            return yw0Var.r;
        }
        if (d1Var.b() == yw0Var.Y) {
            return true;
        }
        switch (d1Var.f) {
        }
        return yw0Var.r;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.a0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        yw0 yw0Var = this.d;
        if (i3 == yw0Var.x || i3 == yw0Var.M || i3 == yw0Var.V || i3 == yw0Var.R) {
            return 0;
        }
        if (i3 == yw0Var.H || i3 == yw0Var.I || i3 == yw0Var.K || i3 == yw0Var.J || i3 == yw0Var.S || i3 == yw0Var.T || i3 == yw0Var.Y) {
            return 1;
        }
        if (i3 == yw0Var.P || i3 == yw0Var.X || i3 == yw0Var.L || i3 == yw0Var.U) {
            return 2;
        }
        if (i3 == yw0Var.W) {
            return 3;
        }
        if (i3 == yw0Var.N || i3 == yw0Var.O) {
            return 4;
        }
        if (i3 == yw0Var.y) {
            return 5;
        }
        if (i3 == yw0Var.E || i3 == yw0Var.Z) {
            return 6;
        }
        return (i3 == yw0Var.F || i3 == yw0Var.G || i3 == yw0Var.Q) ? 7 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject M0;
        int i14;
        int i15;
        yw0 yw0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = yw0Var.e;
        long j10 = yw0Var.h;
        long j11 = yw0Var.f;
        int i16 = d1Var.f;
        View view = d1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 != yw0Var.x) {
                    if (i3 != yw0Var.M) {
                        if (i3 != yw0Var.V) {
                            if (i3 == yw0Var.R) {
                                n4Var.setText(org.telegram.messenger.bd.M0(2131743289, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.bd.M0(2131747912, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131746647, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131750482, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                String v = org.telegram.messenger.us.v(j11, j10, false);
                i10 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i10).d7;
                if (i3 != yw0Var.Y) {
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, e6Var);
                    if (i3 != yw0Var.H) {
                        if (i3 != yw0Var.S) {
                            if (i3 != yw0Var.I) {
                                if (i3 != yw0Var.K) {
                                    if (i3 != yw0Var.J) {
                                        if (i3 == yw0Var.T) {
                                            int c2 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c2 != 0 && c2 != 4) {
                                                if (c2 != 1) {
                                                    if (c2 != 2) {
                                                        if (c2 == 3) {
                                                            v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131748731, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131743622, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131745376, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                v9Var.c(org.telegram.messenger.bd.M0(2131743624, null), org.telegram.messenger.bd.M0(2131743623, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c10 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c11 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.hs.K2);
                                        if (c10 != 0) {
                                            v9Var.c(org.telegram.messenger.bd.M0(2131745310, null), org.telegram.messenger.bd.a0("SmartNotificationsInfo", null, 2131745308, Integer.valueOf(c10), org.telegram.messenger.bd.G(c11 / 60, "Minutes", new Object[0])), false, yw0Var.K != -1);
                                            break;
                                        } else {
                                            v9Var.c(org.telegram.messenger.bd.M0(2131745310, null), org.telegram.messenger.bd.M0(2131745309, null), false, yw0Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c12 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                                    if (c12 != 0) {
                                        if (c12 != 1 && c12 != 2) {
                                            if (c12 != 3) {
                                                if (c12 != 4) {
                                                    if (c12 == 5) {
                                                        v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747889, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747890, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747888, null), false, false);
                                                break;
                                            }
                                        } else {
                                            v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747887, null), false, false);
                                            break;
                                        }
                                    } else {
                                        v9Var.c(org.telegram.messenger.bd.M0(2131747914, null), org.telegram.messenger.bd.M0(2131747891, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c13 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                                if (c13 != 0 && c13 != 4) {
                                    if (c13 != 1) {
                                        if (c13 != 2) {
                                            if (c13 == 3) {
                                                String M02 = org.telegram.messenger.bd.M0(2131743624, null);
                                                String M03 = org.telegram.messenger.bd.M0(2131748731, null);
                                                if (yw0Var.J == -1 && yw0Var.K == -1) {
                                                    r12 = false;
                                                }
                                                v9Var.c(M02, M03, false, r12);
                                                break;
                                            }
                                        } else {
                                            String M04 = org.telegram.messenger.bd.M0(2131743624, null);
                                            String M05 = org.telegram.messenger.bd.M0(2131743622, null);
                                            if (yw0Var.J == -1 && yw0Var.K == -1) {
                                                r12 = false;
                                            }
                                            v9Var.c(M04, M05, false, r12);
                                            break;
                                        }
                                    } else {
                                        String M06 = org.telegram.messenger.bd.M0(2131743624, null);
                                        String M07 = org.telegram.messenger.bd.M0(2131745376, null);
                                        if (yw0Var.J == -1 && yw0Var.K == -1) {
                                            r12 = false;
                                        }
                                        v9Var.c(M06, M07, false, r12);
                                        break;
                                    }
                                } else {
                                    String M08 = org.telegram.messenger.bd.M0(2131743624, null);
                                    String M09 = org.telegram.messenger.bd.M0(2131743623, null);
                                    if (yw0Var.J == -1 && yw0Var.K == -1) {
                                        r12 = false;
                                    }
                                    v9Var.c(M08, M09, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(t4.c.f("ringtone_", v), org.telegram.messenger.bd.M0(2131751600, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.bd.M0(2131748159, null);
                            }
                            v9Var.c(org.telegram.messenger.bd.M0(2131743251, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(t4.c.f("sound_", v), org.telegram.messenger.bd.M0(2131745290, null));
                        long j12 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c14 = yw0Var.getMediaDataController().A0.c(j12);
                            string2 = c14 == null ? org.telegram.messenger.bd.M0(2131751680, null) : ph0.g0(c14, c14.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.bd.M0(2131748159, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.bd.M0(2131745290, null);
                        }
                        v9Var.c(org.telegram.messenger.bd.M0(2131745293, null), string2, false, true);
                        break;
                    }
                } else {
                    v9Var.b(org.telegram.messenger.bd.M0(2131746114, null), false);
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.q7, e6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i3 != yw0Var.P) {
                    if (i3 != yw0Var.X) {
                        if (i3 != yw0Var.L) {
                            if (i3 == yw0Var.U) {
                                y8Var.setText(org.telegram.messenger.bd.M0(2131743254, null));
                                break;
                            }
                        } else if (yw0Var.K != -1) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746877, null));
                            break;
                        } else {
                            y8Var.setText("");
                            break;
                        }
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131747910, null));
                        break;
                    }
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131746646, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String v10 = org.telegram.messenger.us.v(j11, j10, false);
                i11 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(i11).d7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c15 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.k5.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.m5.z(j11) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.s8.f[i17] == c15) {
                            c15 = org.telegram.ui.Cells.s8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                s8Var.b(c15, org.telegram.messenger.bd.M0(2131747911, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i12 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.hp.s1(i12).d7;
                int c16 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.us.v(j11, j10, false), sharedPreferences3, 0);
                if (c16 == 0) {
                    c16 = sharedPreferences3.getInt(org.telegram.messenger.m5.z(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i3 != yw0Var.N) {
                    if (i3 == yw0Var.O) {
                        h6Var.c(org.telegram.messenger.bd.M0(2131747108, null), c16 == 2, false);
                        h6Var.setTag(2);
                        break;
                    }
                } else {
                    h6Var.c(org.telegram.messenger.bd.M0(2131747107, null), c16 == 1, true);
                    h6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j11)) {
                    i14 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j11));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    M0 = org.telegram.messenger.hp.s1(i13).M0(Long.valueOf(-j11));
                }
                oaVar.a(null, M0);
                break;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                boolean z10 = i3 > 0;
                r12 = i3 < yw0Var.a0 - 1;
                if (x6Var.c != z10 || x6Var.d != r12) {
                    x6Var.c = z10;
                    x6Var.d = r12;
                    int i18 = x6Var.b;
                    if (i18 != 0) {
                        x6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        x6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i15 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.hp.s1(i15).d7;
                if (i3 != yw0Var.F) {
                    if (i3 != yw0Var.G) {
                        if (i3 == yw0Var.Q) {
                            String f10 = t4.c.f("stories_", org.telegram.messenger.us.v(j11, j10, false));
                            if (yw0Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            q8Var.f(org.telegram.messenger.bd.M0(2131744754, null), sharedPreferences4.getBoolean(f10, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.us.v(j11, j10, false);
                        q8Var.f(org.telegram.messenger.bd.M0(2131748545, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    q8Var.f(org.telegram.messenger.bd.M0(2131747932, null), yw0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View n4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.d.e;
        Context context = this.c;
        switch (i3) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.s8(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.h6(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.q8(context, e6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                break;
        }
        return k2.p1.p(n4Var, n4Var, -1, -2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f;
        View view = d1Var.a;
        yw0 yw0Var = this.d;
        if (i3 == 0) {
            ((org.telegram.ui.Cells.n4) view).a(null, yw0Var.r);
            return;
        }
        if (i3 == 1) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (d1Var.b() == yw0Var.Y) {
                v9Var.a(null, true);
                return;
            } else {
                v9Var.a(null, yw0Var.r);
                return;
            }
        }
        if (i3 == 2) {
            ((org.telegram.ui.Cells.y8) view).c(null, yw0Var.r);
            return;
        }
        if (i3 == 3) {
            ((org.telegram.ui.Cells.s8) view).a(null, yw0Var.r);
            return;
        }
        if (i3 == 4) {
            ((org.telegram.ui.Cells.h6) view).b(null, yw0Var.r);
            return;
        }
        if (i3 != 7) {
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        if (d1Var.b() == yw0Var.G) {
            q8Var.e(null, yw0Var.r);
        } else if (d1Var.b() == yw0Var.Q) {
            q8Var.e(null, yw0Var.r);
        } else {
            q8Var.e(null, true);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ uy0 d;

    public sy0(uy0 uy0Var, Context context) {
        this.d = uy0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        uy0 uy0Var = this.d;
        if (b10 == uy0Var.F) {
            return uy0Var.r;
        }
        if (c1Var.b() == uy0Var.X) {
            return true;
        }
        switch (c1Var.f) {
        }
        return uy0Var.r;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.Z;
    }

    @Override // s4.g0
    public final int d(int i10) {
        uy0 uy0Var = this.d;
        if (i10 == uy0Var.x || i10 == uy0Var.L || i10 == uy0Var.U || i10 == uy0Var.Q) {
            return 0;
        }
        if (i10 == uy0Var.G || i10 == uy0Var.H || i10 == uy0Var.J || i10 == uy0Var.I || i10 == uy0Var.R || i10 == uy0Var.S || i10 == uy0Var.X) {
            return 1;
        }
        if (i10 == uy0Var.O || i10 == uy0Var.W || i10 == uy0Var.K || i10 == uy0Var.T) {
            return 2;
        }
        if (i10 == uy0Var.V) {
            return 3;
        }
        if (i10 == uy0Var.M || i10 == uy0Var.N) {
            return 4;
        }
        if (i10 == uy0Var.y) {
            return 5;
        }
        if (i10 == uy0Var.D || i10 == uy0Var.Y) {
            return 6;
        }
        return (i10 == uy0Var.E || i10 == uy0Var.F || i10 == uy0Var.P) ? 7 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject L0;
        int i15;
        int i16;
        uy0 uy0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = uy0Var.e;
        long j10 = uy0Var.h;
        long j11 = uy0Var.f;
        int i17 = c1Var.f;
        View view = c1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 != uy0Var.x) {
                    if (i10 != uy0Var.L) {
                        if (i10 != uy0Var.U) {
                            if (i10 == uy0Var.Q) {
                                p4Var.setText(org.telegram.messenger.cd.L0(2131743305, null));
                                break;
                            }
                        } else {
                            p4Var.setText(org.telegram.messenger.cd.L0(2131747920, null));
                            break;
                        }
                    } else {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131746654, null));
                        break;
                    }
                } else {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131750483, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String v = org.telegram.messenger.ot.v(j11, j10, false);
                i11 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i11).e7;
                if (i10 != uy0Var.X) {
                    org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.G6, p6Var);
                    if (i10 != uy0Var.G) {
                        if (i10 != uy0Var.R) {
                            if (i10 != uy0Var.H) {
                                if (i10 != uy0Var.J) {
                                    if (i10 != uy0Var.I) {
                                        if (i10 == uy0Var.S) {
                                            int c10 = org.telegram.messenger.m5.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            x9Var.c(org.telegram.messenger.cd.L0(2131743640, null), org.telegram.messenger.cd.L0(2131748734, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        x9Var.c(org.telegram.messenger.cd.L0(2131743640, null), org.telegram.messenger.cd.L0(2131743638, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(org.telegram.messenger.cd.L0(2131743640, null), org.telegram.messenger.cd.L0(2131745384, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(org.telegram.messenger.cd.L0(2131743640, null), org.telegram.messenger.cd.L0(2131743639, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.m5.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.m5.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.zs.K2);
                                        if (c11 != 0) {
                                            x9Var.c(org.telegram.messenger.cd.L0(2131745318, null), org.telegram.messenger.cd.a0("SmartNotificationsInfo", null, 2131745316, Integer.valueOf(c11), org.telegram.messenger.cd.G(c12 / 60, "Minutes", new Object[0])), false, uy0Var.J != -1);
                                            break;
                                        } else {
                                            x9Var.c(org.telegram.messenger.cd.L0(2131745318, null), org.telegram.messenger.cd.L0(2131745317, null), false, uy0Var.J != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.m5.c("priority_", v, sharedPreferences, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        x9Var.c(org.telegram.messenger.cd.L0(2131747922, null), org.telegram.messenger.cd.L0(2131747897, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(org.telegram.messenger.cd.L0(2131747922, null), org.telegram.messenger.cd.L0(2131747898, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(org.telegram.messenger.cd.L0(2131747922, null), org.telegram.messenger.cd.L0(2131747896, null), false, false);
                                                break;
                                            }
                                        } else {
                                            x9Var.c(org.telegram.messenger.cd.L0(2131747922, null), org.telegram.messenger.cd.L0(2131747895, null), false, false);
                                            break;
                                        }
                                    } else {
                                        x9Var.c(org.telegram.messenger.cd.L0(2131747922, null), org.telegram.messenger.cd.L0(2131747899, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.m5.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String L02 = org.telegram.messenger.cd.L0(2131743640, null);
                                                String L03 = org.telegram.messenger.cd.L0(2131748734, null);
                                                if (uy0Var.I == -1 && uy0Var.J == -1) {
                                                    r12 = false;
                                                }
                                                x9Var.c(L02, L03, false, r12);
                                                break;
                                            }
                                        } else {
                                            String L04 = org.telegram.messenger.cd.L0(2131743640, null);
                                            String L05 = org.telegram.messenger.cd.L0(2131743638, null);
                                            if (uy0Var.I == -1 && uy0Var.J == -1) {
                                                r12 = false;
                                            }
                                            x9Var.c(L04, L05, false, r12);
                                            break;
                                        }
                                    } else {
                                        String L06 = org.telegram.messenger.cd.L0(2131743640, null);
                                        String L07 = org.telegram.messenger.cd.L0(2131745384, null);
                                        if (uy0Var.I == -1 && uy0Var.J == -1) {
                                            r12 = false;
                                        }
                                        x9Var.c(L06, L07, false, r12);
                                        break;
                                    }
                                } else {
                                    String L08 = org.telegram.messenger.cd.L0(2131743640, null);
                                    String L09 = org.telegram.messenger.cd.L0(2131743639, null);
                                    if (uy0Var.I == -1 && uy0Var.J == -1) {
                                        r12 = false;
                                    }
                                    x9Var.c(L08, L09, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(sc.e.h("ringtone_", v), org.telegram.messenger.cd.L0(2131751600, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.cd.L0(2131748167, null);
                            }
                            x9Var.c(org.telegram.messenger.cd.L0(2131743267, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(sc.e.h("sound_", v), org.telegram.messenger.cd.L0(2131745298, null));
                        long j12 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c15 = uy0Var.getMediaDataController().z0.c(j12);
                            string2 = c15 == null ? org.telegram.messenger.cd.L0(2131751680, null) : yi0.f0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.cd.L0(2131748167, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.cd.L0(2131745298, null);
                        }
                        x9Var.c(org.telegram.messenger.cd.L0(2131745301, null), string2, false, true);
                        break;
                    }
                } else {
                    x9Var.b(org.telegram.messenger.cd.L0(2131746121, null), false);
                    org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.q7, p6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 != uy0Var.O) {
                    if (i10 != uy0Var.W) {
                        if (i10 != uy0Var.K) {
                            if (i10 == uy0Var.T) {
                                b9Var.setText(org.telegram.messenger.cd.L0(2131743270, null));
                                break;
                            }
                        } else if (uy0Var.J != -1) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746884, null));
                            break;
                        } else {
                            b9Var.setText("");
                            break;
                        }
                    } else {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131747918, null));
                        break;
                    }
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131746653, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                String v10 = org.telegram.messenger.ot.v(j11, j10, false);
                i12 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.vp.r1(i12).e7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.m5.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.o5.z(j11) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.v8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.v8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                v8Var.b(c16, org.telegram.messenger.cd.L0(2131747919, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                i13 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.vp.r1(i13).e7;
                int c17 = org.telegram.messenger.m5.c("popup_", org.telegram.messenger.ot.v(j11, j10, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.o5.z(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != uy0Var.M) {
                    if (i10 == uy0Var.N) {
                        m6Var.c(org.telegram.messenger.cd.L0(2131747115, null), c17 == 2, false);
                        m6Var.setTag(2);
                        break;
                    }
                } else {
                    m6Var.c(org.telegram.messenger.cd.L0(2131747114, null), c17 == 1, true);
                    m6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.o5.E(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i15).Z1(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    L0 = org.telegram.messenger.vp.r1(i14).L0(Long.valueOf(-j11));
                }
                oaVar.a(null, L0);
                break;
            case 6:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                boolean z10 = i10 > 0;
                r12 = i10 < uy0Var.Z - 1;
                if (c7Var.c != z10 || c7Var.d != r12) {
                    c7Var.c = z10;
                    c7Var.d = r12;
                    int i19 = c7Var.b;
                    if (i19 != 0) {
                        c7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        c7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i16 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.vp.r1(i16).e7;
                if (i10 != uy0Var.E) {
                    if (i10 != uy0Var.F) {
                        if (i10 == uy0Var.P) {
                            String h = sc.e.h("stories_", org.telegram.messenger.ot.v(j11, j10, false));
                            if (uy0Var.a0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            t8Var.f(org.telegram.messenger.cd.L0(2131744762, null), sharedPreferences4.getBoolean(h, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.ot.v(j11, j10, false);
                        t8Var.f(org.telegram.messenger.cd.L0(2131748552, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    t8Var.f(org.telegram.messenger.cd.L0(2131747940, null), uy0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p4Var;
        org.telegram.ui.ActionBar.p6 p6Var = this.d.e;
        Context context = this.c;
        switch (i10) {
            case 0:
                p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
            case 1:
                p4Var = new org.telegram.ui.Cells.x9(0, context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
            case 2:
                p4Var = new org.telegram.ui.Cells.b9(context, p6Var);
                break;
            case 3:
                p4Var = new org.telegram.ui.Cells.v8(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
            case 4:
                p4Var = new org.telegram.ui.Cells.m6(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
            case 5:
                p4Var = new org.telegram.ui.Cells.oa(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
            case 6:
                p4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                p4Var = new org.telegram.ui.Cells.t8(context, p6Var);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                break;
        }
        return sc.e.o(p4Var, p4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        uy0 uy0Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.p4) view).a(null, uy0Var.r);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (c1Var.b() == uy0Var.X) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, uy0Var.r);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.b9) view).c(null, uy0Var.r);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.v8) view).a(null, uy0Var.r);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.m6) view).b(null, uy0Var.r);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        if (c1Var.b() == uy0Var.F) {
            t8Var.e(null, uy0Var.r);
        } else if (c1Var.b() == uy0Var.P) {
            t8Var.e(null, uy0Var.r);
        } else {
            t8Var.e(null, true);
        }
    }
}

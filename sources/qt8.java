// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qt8 extends q59 {
    public final Context c;
    public final /* synthetic */ st8 d;

    public qt8(st8 st8Var, Context context) {
        this.d = st8Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        st8 st8Var = this.d;
        if (b == st8Var.G) {
            return st8Var.r;
        }
        if (u69Var.b() == st8Var.Y) {
            return true;
        }
        switch (u69Var.f) {
        }
        return st8Var.r;
    }

    @Override // y59
    public final int b() {
        return this.d.a0;
    }

    @Override // y59
    public final int d(int i) {
        st8 st8Var = this.d;
        if (i == st8Var.x || i == st8Var.M || i == st8Var.V || i == st8Var.R) {
            return 0;
        }
        if (i == st8Var.H || i == st8Var.I || i == st8Var.K || i == st8Var.J || i == st8Var.S || i == st8Var.T || i == st8Var.Y) {
            return 1;
        }
        if (i == st8Var.P || i == st8Var.X || i == st8Var.L || i == st8Var.U) {
            return 2;
        }
        if (i == st8Var.W) {
            return 3;
        }
        if (i == st8Var.N || i == st8Var.O) {
            return 4;
        }
        if (i == st8Var.y) {
            return 5;
        }
        if (i == st8Var.E || i == st8Var.Z) {
            return 6;
        }
        return (i == st8Var.F || i == st8Var.G || i == st8Var.Q) ? 7 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        TLObject L0;
        int i6;
        int i7;
        st8 st8Var = this.d;
        ylb ylbVar = st8Var.e;
        long j = st8Var.h;
        long j2 = st8Var.f;
        int i8 = u69Var.f;
        View view = u69Var.a;
        switch (i8) {
            case 0:
                jf5 jf5Var = (jf5) view;
                if (i != st8Var.x) {
                    if (i != st8Var.M) {
                        if (i != st8Var.V) {
                            if (i == st8Var.R) {
                                jf5Var.setText(jb6.M0(2131742963, null));
                                break;
                            }
                        } else {
                            jf5Var.setText(jb6.M0(2131747637, null));
                            break;
                        }
                    } else {
                        jf5Var.setText(jb6.M0(2131746372, null));
                        break;
                    }
                } else {
                    jf5Var.setText(jb6.M0(2131750407, null));
                    break;
                }
                break;
            case 1:
                vkb vkbVar = (vkb) view;
                String p = lo7.p(j2, j, false);
                i2 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences = oc7.r1(i2).W3;
                if (i != st8Var.Y) {
                    anb.X(vkbVar.getTextView(), cmb.F6, ylbVar);
                    if (i != st8Var.H) {
                        if (i != st8Var.S) {
                            if (i != st8Var.I) {
                                if (i != st8Var.K) {
                                    if (i != st8Var.J) {
                                        if (i == st8Var.T) {
                                            int g = kt6.g("calls_vibrate_", p, sharedPreferences, 0);
                                            if (g != 0 && g != 4) {
                                                if (g != 1) {
                                                    if (g != 2) {
                                                        if (g == 3) {
                                                            vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131748480, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131743299, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131745100, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131743300, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int g2 = kt6.g("smart_max_count_", p, sharedPreferences, 2);
                                        int g3 = kt6.g("smart_delay_", p, sharedPreferences, nm7.J2);
                                        if (g2 != 0) {
                                            vkbVar.c(jb6.M0(2131745034, null), jb6.a0("SmartNotificationsInfo", null, 2131745032, Integer.valueOf(g2), jb6.G(g3 / 60, "Minutes", new Object[0])), false, st8Var.K != -1);
                                            break;
                                        } else {
                                            vkbVar.c(jb6.M0(2131745034, null), jb6.M0(2131745033, null), false, st8Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int g4 = kt6.g("priority_", p, sharedPreferences, 3);
                                    if (g4 != 0) {
                                        if (g4 != 1 && g4 != 2) {
                                            if (g4 != 3) {
                                                if (g4 != 4) {
                                                    if (g4 == 5) {
                                                        vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747614, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747615, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747613, null), false, false);
                                                break;
                                            }
                                        } else {
                                            vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747612, null), false, false);
                                            break;
                                        }
                                    } else {
                                        vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747616, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int g5 = kt6.g("vibrate_", p, sharedPreferences, 0);
                                if (g5 != 0 && g5 != 4) {
                                    if (g5 != 1) {
                                        if (g5 != 2) {
                                            if (g5 == 3) {
                                                String M0 = jb6.M0(2131743301, null);
                                                String M02 = jb6.M0(2131748480, null);
                                                if (st8Var.J == -1 && st8Var.K == -1) {
                                                    r11 = false;
                                                }
                                                vkbVar.c(M0, M02, false, r11);
                                                break;
                                            }
                                        } else {
                                            String M03 = jb6.M0(2131743301, null);
                                            String M04 = jb6.M0(2131743299, null);
                                            if (st8Var.J == -1 && st8Var.K == -1) {
                                                r11 = false;
                                            }
                                            vkbVar.c(M03, M04, false, r11);
                                            break;
                                        }
                                    } else {
                                        String M05 = jb6.M0(2131743301, null);
                                        String M06 = jb6.M0(2131745100, null);
                                        if (st8Var.J == -1 && st8Var.K == -1) {
                                            r11 = false;
                                        }
                                        vkbVar.c(M05, M06, false, r11);
                                        break;
                                    }
                                } else {
                                    String M07 = jb6.M0(2131743301, null);
                                    String M08 = jb6.M0(2131743300, null);
                                    if (st8Var.J == -1 && st8Var.K == -1) {
                                        r11 = false;
                                    }
                                    vkbVar.c(M07, M08, false, r11);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(b10.h("ringtone_", p), jb6.M0(2131751536, null));
                            if (string.equals("NoSound")) {
                                string = jb6.M0(2131747885, null);
                            }
                            vkbVar.c(jb6.M0(2131742925, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(b10.h("sound_", p), jb6.M0(2131745014, null));
                        long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                        if (j3 != 0) {
                            TLRPC.Document c = st8Var.getMediaDataController().A0.c(j3);
                            string2 = c == null ? jb6.M0(2131751616, null) : ep7.g0(c, c.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = jb6.M0(2131747885, null);
                        } else if (string2.equals("Default")) {
                            string2 = jb6.M0(2131745014, null);
                        }
                        vkbVar.c(jb6.M0(2131745017, null), string2, false, true);
                        break;
                    }
                } else {
                    vkbVar.b(jb6.M0(2131745837, null), false);
                    anb.X(vkbVar.getTextView(), cmb.p7, ylbVar);
                    break;
                }
                break;
            case 2:
                njb njbVar = (njb) view;
                njbVar.setFixedSize(0);
                if (i != st8Var.P) {
                    if (i != st8Var.X) {
                        if (i != st8Var.L) {
                            if (i == st8Var.U) {
                                njbVar.setText(jb6.M0(2131742928, null));
                                break;
                            }
                        } else if (st8Var.K != -1) {
                            njbVar.setText(jb6.M0(2131746604, null));
                            break;
                        } else {
                            njbVar.setText("");
                            break;
                        }
                    } else {
                        njbVar.setText(jb6.M0(2131747635, null));
                        break;
                    }
                } else {
                    njbVar.setText(jb6.M0(2131746371, null));
                    break;
                }
                break;
            case 3:
                djb djbVar = (djb) view;
                String p2 = lo7.p(j2, j, false);
                i3 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences2 = oc7.r1(i3).W3;
                StringBuilder sb = new StringBuilder("color_");
                sb.append(p2);
                int g6 = sharedPreferences2.contains(sb.toString()) ? kt6.g("color_", p2, sharedPreferences2, -16776961) : pg3.y(j2) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        if (djb.f[i9] == g6) {
                            g6 = djb.e[i9];
                        } else {
                            i9++;
                        }
                    }
                }
                djbVar.b(g6, jb6.M0(2131747636, null), false);
                break;
            case 4:
                w09 w09Var = (w09) view;
                i4 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences3 = oc7.r1(i4).W3;
                int g7 = kt6.g("popup_", lo7.p(j2, j, false), sharedPreferences3, 0);
                if (g7 == 0) {
                    g7 = sharedPreferences3.getInt(pg3.y(j2) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i != st8Var.N) {
                    if (i == st8Var.O) {
                        w09Var.c(jb6.M0(2131746833, null), g7 == 2, false);
                        w09Var.setTag(2);
                        break;
                    }
                } else {
                    w09Var.c(jb6.M0(2131746832, null), g7 == 1, true);
                    w09Var.setTag(1);
                    break;
                }
                break;
            case 5:
                v8c v8cVar = (v8c) view;
                if (pg3.D(j2)) {
                    i6 = ((d) st8Var).currentAccount;
                    L0 = oc7.r1(i6).W1(Long.valueOf(j2));
                } else {
                    i5 = ((d) st8Var).currentAccount;
                    L0 = oc7.r1(i5).L0(Long.valueOf(-j2));
                }
                v8cVar.a(null, L0);
                break;
            case 6:
                bba bbaVar = (bba) view;
                boolean z = i > 0;
                r11 = i < st8Var.a0 - 1;
                if (bbaVar.c != z || bbaVar.d != r11) {
                    bbaVar.c = z;
                    bbaVar.d = r11;
                    int i10 = bbaVar.b;
                    if (i10 != 0) {
                        bbaVar.setBackgroundColor(i10);
                        break;
                    } else {
                        bbaVar.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                bjb bjbVar = (bjb) view;
                i7 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences4 = oc7.r1(i7).W3;
                if (i != st8Var.F) {
                    if (i != st8Var.G) {
                        if (i == st8Var.Q) {
                            String h = b10.h("stories_", lo7.p(j2, j, false));
                            if (st8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r12 = true;
                            }
                            bjbVar.f(jb6.M0(2131744433, null), sharedPreferences4.getBoolean(h, r12), true);
                            break;
                        }
                    } else {
                        String p3 = lo7.p(j2, j, false);
                        bjbVar.f(jb6.M0(2131748294, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                        break;
                    }
                } else {
                    bjbVar.f(jb6.M0(2131747657, null), st8Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View jf5Var;
        ylb ylbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                jf5Var = new jf5(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 1:
                jf5Var = new vkb(0, ylbVar, context);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 2:
                jf5Var = new njb(context, ylbVar);
                break;
            case 3:
                jf5Var = new djb(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 4:
                jf5Var = new w09(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 5:
                jf5Var = new v8c(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 6:
                jf5Var = new bba(context, (hg9) null);
                break;
            default:
                jf5Var = new bjb(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
        }
        return kt6.h(jf5Var, jf5Var, -1, -2);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        View view = u69Var.a;
        st8 st8Var = this.d;
        if (i == 0) {
            ((jf5) view).a(null, st8Var.r);
            return;
        }
        if (i == 1) {
            vkb vkbVar = (vkb) view;
            if (u69Var.b() == st8Var.Y) {
                vkbVar.a(null, true);
                return;
            } else {
                vkbVar.a(null, st8Var.r);
                return;
            }
        }
        if (i == 2) {
            ((njb) view).c(null, st8Var.r);
            return;
        }
        if (i == 3) {
            ((djb) view).a(null, st8Var.r);
            return;
        }
        if (i == 4) {
            ((w09) view).b(null, st8Var.r);
            return;
        }
        if (i != 7) {
            return;
        }
        bjb bjbVar = (bjb) view;
        if (u69Var.b() == st8Var.G) {
            bjbVar.e(null, st8Var.r);
        } else if (u69Var.b() == st8Var.Q) {
            bjbVar.e(null, st8Var.r);
        } else {
            bjbVar.e(null, true);
        }
    }
}

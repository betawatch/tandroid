// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xu8 extends c79 {
    public final Context c;
    public final /* synthetic */ zu8 d;

    public xu8(zu8 zu8Var, Context context) {
        this.d = zu8Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        zu8 zu8Var = this.d;
        if (b == zu8Var.G) {
            return zu8Var.r;
        }
        if (f89Var.b() == zu8Var.Y) {
            return true;
        }
        switch (f89Var.f) {
        }
        return zu8Var.r;
    }

    @Override // j79
    public final int b() {
        return this.d.a0;
    }

    @Override // j79
    public final int d(int i) {
        zu8 zu8Var = this.d;
        if (i == zu8Var.x || i == zu8Var.M || i == zu8Var.V || i == zu8Var.R) {
            return 0;
        }
        if (i == zu8Var.H || i == zu8Var.I || i == zu8Var.K || i == zu8Var.J || i == zu8Var.S || i == zu8Var.T || i == zu8Var.Y) {
            return 1;
        }
        if (i == zu8Var.P || i == zu8Var.X || i == zu8Var.L || i == zu8Var.U) {
            return 2;
        }
        if (i == zu8Var.W) {
            return 3;
        }
        if (i == zu8Var.N || i == zu8Var.O) {
            return 4;
        }
        if (i == zu8Var.y) {
            return 5;
        }
        if (i == zu8Var.E || i == zu8Var.Z) {
            return 6;
        }
        return (i == zu8Var.F || i == zu8Var.G || i == zu8Var.Q) ? 7 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        TLObject M0;
        int i6;
        int i7;
        zu8 zu8Var = this.d;
        vnb vnbVar = zu8Var.e;
        long j = zu8Var.h;
        long j2 = zu8Var.f;
        int i8 = f89Var.f;
        View view = f89Var.a;
        switch (i8) {
            case 0:
                mf5 mf5Var = (mf5) view;
                if (i != zu8Var.x) {
                    if (i != zu8Var.M) {
                        if (i != zu8Var.V) {
                            if (i == zu8Var.R) {
                                mf5Var.setText(ob6.M0(2131742931, null));
                                break;
                            }
                        } else {
                            mf5Var.setText(ob6.M0(2131747631, null));
                            break;
                        }
                    } else {
                        mf5Var.setText(ob6.M0(2131746366, null));
                        break;
                    }
                } else {
                    mf5Var.setText(ob6.M0(2131750435, null));
                    break;
                }
                break;
            case 1:
                qmb qmbVar = (qmb) view;
                String p = ip7.p(j2, j, false);
                i2 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences = uc7.s1(i2).X3;
                if (i != zu8Var.Y) {
                    yob.X(qmbVar.getTextView(), aob.G6, vnbVar);
                    if (i != zu8Var.H) {
                        if (i != zu8Var.S) {
                            if (i != zu8Var.I) {
                                if (i != zu8Var.K) {
                                    if (i != zu8Var.J) {
                                        if (i == zu8Var.T) {
                                            int g = qu6.g("calls_vibrate_", p, sharedPreferences, 0);
                                            if (g != 0 && g != 4) {
                                                if (g != 1) {
                                                    if (g != 2) {
                                                        if (g == 3) {
                                                            qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131748477, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131743267, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131745094, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131743268, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int g2 = qu6.g("smart_max_count_", p, sharedPreferences, 2);
                                        int g3 = qu6.g("smart_delay_", p, sharedPreferences, jn7.J2);
                                        if (g2 != 0) {
                                            qmbVar.c(ob6.M0(2131745028, null), ob6.a0("SmartNotificationsInfo", null, 2131745026, Integer.valueOf(g2), ob6.G(g3 / 60, "Minutes", new Object[0])), false, zu8Var.K != -1);
                                            break;
                                        } else {
                                            qmbVar.c(ob6.M0(2131745028, null), ob6.M0(2131745027, null), false, zu8Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int g4 = qu6.g("priority_", p, sharedPreferences, 3);
                                    if (g4 != 0) {
                                        if (g4 != 1 && g4 != 2) {
                                            if (g4 != 3) {
                                                if (g4 != 4) {
                                                    if (g4 == 5) {
                                                        qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747608, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747609, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747607, null), false, false);
                                                break;
                                            }
                                        } else {
                                            qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747606, null), false, false);
                                            break;
                                        }
                                    } else {
                                        qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747610, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int g5 = qu6.g("vibrate_", p, sharedPreferences, 0);
                                if (g5 != 0 && g5 != 4) {
                                    if (g5 != 1) {
                                        if (g5 != 2) {
                                            if (g5 == 3) {
                                                String M02 = ob6.M0(2131743269, null);
                                                String M03 = ob6.M0(2131748477, null);
                                                if (zu8Var.J == -1 && zu8Var.K == -1) {
                                                    r11 = false;
                                                }
                                                qmbVar.c(M02, M03, false, r11);
                                                break;
                                            }
                                        } else {
                                            String M04 = ob6.M0(2131743269, null);
                                            String M05 = ob6.M0(2131743267, null);
                                            if (zu8Var.J == -1 && zu8Var.K == -1) {
                                                r11 = false;
                                            }
                                            qmbVar.c(M04, M05, false, r11);
                                            break;
                                        }
                                    } else {
                                        String M06 = ob6.M0(2131743269, null);
                                        String M07 = ob6.M0(2131745094, null);
                                        if (zu8Var.J == -1 && zu8Var.K == -1) {
                                            r11 = false;
                                        }
                                        qmbVar.c(M06, M07, false, r11);
                                        break;
                                    }
                                } else {
                                    String M08 = ob6.M0(2131743269, null);
                                    String M09 = ob6.M0(2131743268, null);
                                    if (zu8Var.J == -1 && zu8Var.K == -1) {
                                        r11 = false;
                                    }
                                    qmbVar.c(M08, M09, false, r11);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(c00.i("ringtone_", p), ob6.M0(2131751564, null));
                            if (string.equals("NoSound")) {
                                string = ob6.M0(2131747882, null);
                            }
                            qmbVar.c(ob6.M0(2131742893, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(c00.i("sound_", p), ob6.M0(2131745008, null));
                        long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                        if (j3 != 0) {
                            TLRPC.Document c = zu8Var.getMediaDataController().A0.c(j3);
                            string2 = c == null ? ob6.M0(2131751644, null) : aq7.f0(c, c.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = ob6.M0(2131747882, null);
                        } else if (string2.equals("Default")) {
                            string2 = ob6.M0(2131745008, null);
                        }
                        qmbVar.c(ob6.M0(2131745011, null), string2, false, true);
                        break;
                    }
                } else {
                    qmbVar.b(ob6.M0(2131745831, null), false);
                    yob.X(qmbVar.getTextView(), aob.q7, vnbVar);
                    break;
                }
                break;
            case 2:
                ilb ilbVar = (ilb) view;
                ilbVar.setFixedSize(0);
                if (i != zu8Var.P) {
                    if (i != zu8Var.X) {
                        if (i != zu8Var.L) {
                            if (i == zu8Var.U) {
                                ilbVar.setText(ob6.M0(2131742896, null));
                                break;
                            }
                        } else if (zu8Var.K != -1) {
                            ilbVar.setText(ob6.M0(2131746598, null));
                            break;
                        } else {
                            ilbVar.setText("");
                            break;
                        }
                    } else {
                        ilbVar.setText(ob6.M0(2131747629, null));
                        break;
                    }
                } else {
                    ilbVar.setText(ob6.M0(2131746365, null));
                    break;
                }
                break;
            case 3:
                ykb ykbVar = (ykb) view;
                String p2 = ip7.p(j2, j, false);
                i3 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences2 = uc7.s1(i3).X3;
                StringBuilder sb = new StringBuilder("color_");
                sb.append(p2);
                int g6 = sharedPreferences2.contains(sb.toString()) ? qu6.g("color_", p2, sharedPreferences2, -16776961) : wf3.y(j2) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        if (ykb.f[i9] == g6) {
                            g6 = ykb.e[i9];
                        } else {
                            i9++;
                        }
                    }
                }
                ykbVar.b(g6, ob6.M0(2131747630, null), false);
                break;
            case 4:
                i29 i29Var = (i29) view;
                i4 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences3 = uc7.s1(i4).X3;
                int g7 = qu6.g("popup_", ip7.p(j2, j, false), sharedPreferences3, 0);
                if (g7 == 0) {
                    g7 = sharedPreferences3.getInt(wf3.y(j2) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i != zu8Var.N) {
                    if (i == zu8Var.O) {
                        i29Var.c(ob6.M0(2131746827, null), g7 == 2, false);
                        i29Var.setTag(2);
                        break;
                    }
                } else {
                    i29Var.c(ob6.M0(2131746826, null), g7 == 1, true);
                    i29Var.setTag(1);
                    break;
                }
                break;
            case 5:
                uac uacVar = (uac) view;
                if (wf3.D(j2)) {
                    i6 = ((e) zu8Var).currentAccount;
                    M0 = uc7.s1(i6).X1(Long.valueOf(j2));
                } else {
                    i5 = ((e) zu8Var).currentAccount;
                    M0 = uc7.s1(i5).M0(Long.valueOf(-j2));
                }
                uacVar.a(null, M0);
                break;
            case 6:
                sca scaVar = (sca) view;
                boolean z = i > 0;
                r11 = i < zu8Var.a0 - 1;
                if (scaVar.c != z || scaVar.d != r11) {
                    scaVar.c = z;
                    scaVar.d = r11;
                    int i10 = scaVar.b;
                    if (i10 != 0) {
                        scaVar.setBackgroundColor(i10);
                        break;
                    } else {
                        scaVar.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                wkb wkbVar = (wkb) view;
                i7 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences4 = uc7.s1(i7).X3;
                if (i != zu8Var.F) {
                    if (i != zu8Var.G) {
                        if (i == zu8Var.Q) {
                            String i11 = c00.i("stories_", ip7.p(j2, j, false));
                            if (zu8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r12 = true;
                            }
                            wkbVar.f(ob6.M0(2131744401, null), sharedPreferences4.getBoolean(i11, r12), true);
                            break;
                        }
                    } else {
                        String p3 = ip7.p(j2, j, false);
                        wkbVar.f(ob6.M0(2131748291, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                        break;
                    }
                } else {
                    wkbVar.f(ob6.M0(2131747651, null), zu8Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View mf5Var;
        vnb vnbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                mf5Var = new mf5(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 1:
                mf5Var = new qmb(0, vnbVar, context);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 2:
                mf5Var = new ilb(context, vnbVar);
                break;
            case 3:
                mf5Var = new ykb(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 4:
                mf5Var = new i29(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 5:
                mf5Var = new uac(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 6:
                mf5Var = new sca(context, (uh9) null);
                break;
            default:
                mf5Var = new wkb(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
        }
        return qu6.h(mf5Var, mf5Var, -1, -2);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        View view = f89Var.a;
        zu8 zu8Var = this.d;
        if (i == 0) {
            ((mf5) view).a(null, zu8Var.r);
            return;
        }
        if (i == 1) {
            qmb qmbVar = (qmb) view;
            if (f89Var.b() == zu8Var.Y) {
                qmbVar.a(null, true);
                return;
            } else {
                qmbVar.a(null, zu8Var.r);
                return;
            }
        }
        if (i == 2) {
            ((ilb) view).c(null, zu8Var.r);
            return;
        }
        if (i == 3) {
            ((ykb) view).a(null, zu8Var.r);
            return;
        }
        if (i == 4) {
            ((i29) view).b(null, zu8Var.r);
            return;
        }
        if (i != 7) {
            return;
        }
        wkb wkbVar = (wkb) view;
        if (f89Var.b() == zu8Var.G) {
            wkbVar.e(null, zu8Var.r);
        } else if (f89Var.b() == zu8Var.Q) {
            wkbVar.e(null, zu8Var.r);
        } else {
            wkbVar.e(null, true);
        }
    }
}

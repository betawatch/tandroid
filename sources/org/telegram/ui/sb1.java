package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sb1 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public sb1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.G0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ThemeActivity themeActivity = this.e;
        if (i10 == themeActivity.X || i10 == themeActivity.H || i10 == themeActivity.Y || i10 == themeActivity.V || i10 == themeActivity.M || i10 == themeActivity.N || i10 == themeActivity.J || i10 == themeActivity.I) {
            return 1;
        }
        if (i10 == themeActivity.c0 || i10 == themeActivity.W || i10 == themeActivity.s0 || i10 == themeActivity.x0 || i10 == themeActivity.D0) {
            return 2;
        }
        if (i10 == themeActivity.o0 || i10 == themeActivity.S || i10 == themeActivity.Z || i10 == themeActivity.L || i10 == themeActivity.e0 || i10 == themeActivity.k0 || i10 == themeActivity.h0 || i10 == themeActivity.G || i10 == themeActivity.F0 || i10 == themeActivity.w0 || i10 == themeActivity.y0 || i10 == themeActivity.z0 || i10 == themeActivity.A0) {
            return 3;
        }
        if (i10 == themeActivity.O || i10 == themeActivity.P || i10 == themeActivity.Q || i10 == themeActivity.R) {
            return 4;
        }
        if (i10 == themeActivity.T || i10 == themeActivity.a0 || i10 == themeActivity.d0 || i10 == themeActivity.x || i10 == themeActivity.f0 || i10 == themeActivity.w || i10 == themeActivity.i0 || i10 == themeActivity.g0 || i10 == themeActivity.q0 || i10 == themeActivity.t0 || i10 == themeActivity.E0 || i10 == themeActivity.B0 || i10 == themeActivity.C0) {
            return 5;
        }
        if (i10 == themeActivity.b0) {
            return 6;
        }
        if (i10 == themeActivity.U || i10 == themeActivity.D || i10 == themeActivity.B) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.y || i10 == themeActivity.p0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.C) {
            return 7;
        }
        i14 = themeActivity.sensitiveContentRow;
        if (i10 == i14) {
            return 7;
        }
        i15 = themeActivity.textSizeRow;
        if (i10 == i15) {
            return 8;
        }
        if (i10 == themeActivity.j0) {
            return 9;
        }
        i16 = themeActivity.nightThemeRow;
        if (i10 == i16) {
            return 10;
        }
        i17 = themeActivity.browserRow;
        if (i10 == i17) {
            return 10;
        }
        if (i10 == themeActivity.l0) {
            return 11;
        }
        if (i10 == themeActivity.n0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.v0) {
            return 14;
        }
        i20 = themeActivity.createNewThemeRow;
        if (i10 == i20) {
            return 14;
        }
        i21 = themeActivity.liteModeRow;
        if (i10 == i21) {
            return 14;
        }
        i22 = themeActivity.stickersRow;
        if (i10 == i22) {
            return 14;
        }
        if (i10 == themeActivity.r0) {
            return 15;
        }
        if (i10 == themeActivity.u0) {
            return 16;
        }
        if (i10 == themeActivity.m0) {
            return 17;
        }
        if (i10 == themeActivity.E || i10 == themeActivity.F) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = m1Var.f;
        View view = m1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.k6.o == 0 || org.telegram.ui.ActionBar.k6.J == null) {
                    aaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    aaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.k6.z0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.X) {
                int i24 = org.telegram.ui.ActionBar.k6.r;
                int i25 = i24 / 60;
                aaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.Y) {
                int i26 = org.telegram.ui.ActionBar.k6.s;
                int i27 = i26 / 60;
                aaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.V) {
                aaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.w, false, false);
                return;
            }
            if (i10 == themeActivity.N) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                aaVar.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.M) {
                aaVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.H) {
                int i29 = SharedConfig.distanceSystemType;
                aaVar.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.L0, themeActivity.A0 >= 0);
                themeActivity.L0 = false;
                return;
            } else if (i10 == themeActivity.I) {
                aaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.m1.a().a, themeActivity.M0, false);
                return;
            } else {
                if (i10 == themeActivity.J) {
                    aaVar.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.K0, false);
                    themeActivity.K0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i10 == themeActivity.c0) {
                a9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.W) {
                a9Var.setText(ThemeActivity.y0());
                return;
            }
            if (i10 == themeActivity.s0) {
                a9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.D0) {
                a9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            if (i10 == themeActivity.O) {
                faVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.k6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.P) {
                faVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.k6.o == 1, true);
                return;
            } else if (i10 == themeActivity.Q) {
                faVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.k6.o == 2, themeActivity.R != -1);
                return;
            } else {
                if (i10 == themeActivity.R) {
                    faVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.k6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == themeActivity.T) {
                m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.a0) {
                m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.d0) {
                m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.f0) {
                if (themeActivity.f == 3) {
                    m4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i10 == themeActivity.w) {
                m4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i10 == themeActivity.i0) {
                m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.g0) {
                m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.q0) {
                m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.t0) {
                m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.E0) {
                m4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.C0) {
                m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.B0) {
                    m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.k6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == themeActivity.U) {
                s8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.k6.p, true);
                return;
            }
            if (i10 == themeActivity.K) {
                s8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.D) {
                s8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.B) {
                s8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                s8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.C) {
                s8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                s8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                s8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                s8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                s8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.p0) {
                    s8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                o8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.k6.q6;
                o8Var.e(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                o8Var.m(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.v0) {
                o8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.k6.q6;
                o8Var.e(i32, i32);
                o8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                o8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.k6.q6;
                o8Var.e(i33, i33);
                o8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                o8Var.e(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                o8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                o8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                o8Var.v = 60;
                o8Var.s = 64;
                o8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                o8Var.e(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                o8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                o8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                o8Var.s = 64;
                o8Var.v = 60;
                o8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((dv) view).b();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i10 == themeActivity.E) {
                i6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                i6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((so0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        j5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z4 = org.telegram.ui.ActionBar.k6.o != 0;
                    String z02 = z4 ? org.telegram.ui.ActionBar.k6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z4) {
                        int i34 = org.telegram.ui.ActionBar.k6.o;
                        z02 = android.support.v4.media.a.z(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
                    }
                    j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z4, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.w1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
                ub1 ub1Var = (ub1) sl0Var.getAdapter();
                ub1Var.l();
                int indexOf = ub1Var.e.indexOf(ub1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = ub1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((f2.j0) sl0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.fa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.ob1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.so0] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ?? faVar;
        View j5Var;
        int i11;
        org.telegram.ui.ActionBar.f5 f5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                j5Var = new org.telegram.ui.Cells.aa(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                faVar = new org.telegram.ui.Cells.fa(context);
                faVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                faVar.a = textView;
                b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z4 = LocaleController.isRTL;
                faVar.addView(textView, k7.c6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 71.0f : 21.0f, 0.0f, z4 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                faVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                faVar.addView(imageView, k7.c6.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = faVar;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new nb1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                j5Var = new tb1(themeActivity, context);
                break;
            case 9:
                faVar = new ob1(context);
                faVar.b = new org.telegram.ui.Cells.x0[2];
                faVar.setOrientation(0);
                faVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) faVar.b;
                    if (i14 >= x0VarArr.length) {
                        j5Var = faVar;
                        break;
                    } else {
                        boolean z10 = i14 == 1;
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context);
                        x0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.d = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.b = z10;
                        x0Var.setContentDescription(LocaleController.getString(z10 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        x0Var.addView(w0Var, k7.c6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        w0Var.a((z10 && SharedConfig.useThreeLinesLayout) || !(z10 || SharedConfig.useThreeLinesLayout), false);
                        x0VarArr[i14] = x0Var;
                        faVar.addView(((org.telegram.ui.Cells.x0[]) faVar.b)[i14], k7.c6.m(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) faVar.b)[i14].setOnClickListener(new oh.b2(3, faVar, z10));
                        i14++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                pb1 pb1Var = new pb1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = pb1Var;
                pb1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                qb1 qb1Var = new qb1(context, 0, g6Var);
                qb1Var.setFocusable(false);
                qb1Var.setItemAnimator(null);
                qb1Var.setLayoutAnimation(null);
                qb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                qb1Var.setClipToPadding(false);
                f2.j0 j0Var = new f2.j0();
                j0Var.j1(0);
                qb1Var.setLayoutManager(j0Var);
                ub1 ub1Var = new ub1(themeActivity, context);
                qb1Var.setAdapter(ub1Var);
                qb1Var.setOnItemClickListener(new lb1(this, ub1Var, qb1Var, 0));
                qb1Var.setOnItemLongClickListener(new vl0(21, this, ub1Var));
                qb1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(62.0f)));
                j5Var = qb1Var;
                break;
            case 13:
                j5Var = new ib1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.o8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0(context);
                Paint paint = new Paint(1);
                wy0Var.a = paint;
                wy0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                wy0Var.c = paint2;
                Paint paint3 = new Paint(1);
                wy0Var.d = paint3;
                wy0Var.e = new RectF();
                wy0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                wy0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.d9};
                wy0Var.r = new org.telegram.ui.Components.hj0[6];
                wy0Var.v = new org.telegram.ui.Components.kj0[2];
                wy0Var.x = 1.0f;
                int i15 = org.telegram.ui.ActionBar.k6.c9;
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(wy0Var, context);
                wy0Var.f = vy0Var;
                vy0Var.setMinValue(0);
                vy0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i11).dialogFilters.isEmpty();
                vy0Var.setMaxValue(isEmpty ? 4 : 5);
                vy0Var.setAllItemsCount(isEmpty ? 5 : 6);
                vy0Var.setWrapSelectorWheel(true);
                vy0Var.setFormatter(new org.telegram.ui.Components.uy0(wy0Var));
                vy0Var.setOnValueChangedListener(new org.telegram.ui.Components.uy0(wy0Var));
                vy0Var.setImportantForAccessibility(2);
                vy0Var.setValue(SharedConfig.getChatSwipeAction(i11));
                wy0Var.addView(vy0Var, k7.c6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                wy0Var.setWillNotDraw(false);
                wy0Var.s = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    wy0Var.v[i16] = new org.telegram.ui.Components.kj0(context);
                    wy0Var.addView(wy0Var.v[i16], k7.c6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.hj0 a2 = wy0Var.a(wy0Var.f.getValue());
                if (a2 != null) {
                    wy0Var.v[0].setImageDrawable(a2);
                    a2.K(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(wy0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(wy0Var.v[1], false, 0.5f, false);
                wy0Var.w = wy0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                wy0Var.C = wy0Var.f.getValue();
                j5Var = wy0Var;
                break;
            case 16:
                f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
                View rb1Var = new rb1(context, f5Var, 0);
                rb1Var.setImportantForAccessibility(4);
                j5Var = rb1Var;
                break;
            case 17:
                View dvVar = new dv(themeActivity.f, context, themeActivity);
                dvVar.setFocusable(false);
                dvVar.setLayoutParams(new f2.x0(-1, -2));
                j5Var = dvVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.U2 = new ArrayList();
                tVar.W2 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                f2.j0 j0Var2 = new f2.j0(0, false);
                tVar.V2 = j0Var2;
                tVar.setLayoutManager(j0Var2);
                int i17 = 1;
                tVar.setAdapter(new y7(tVar, i17));
                tVar.i(new hg.e2(tVar, i17));
                tVar.setOnItemClickListener(new oh.d0(tVar, themeActivity, context, i17));
                tVar.v1();
                j5Var = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                faVar = new so0(i13, 0L, this.c, themeActivity.getResourceProvider());
                j5Var = faVar;
                break;
        }
        return new org.telegram.ui.Components.el0(j5Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        if (m1Var.f == 4) {
            ((org.telegram.ui.Cells.fa) m1Var.a).setTypeChecked(m1Var.b() == org.telegram.ui.ActionBar.k6.o);
        }
    }
}

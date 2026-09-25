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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yb1 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public yb1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.J0;
    }

    @Override // s4.h0
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
        if (i10 == themeActivity.a0 || i10 == themeActivity.K || i10 == themeActivity.b0 || i10 == themeActivity.Y || i10 == themeActivity.P || i10 == themeActivity.Q || i10 == themeActivity.M || i10 == themeActivity.L) {
            return 1;
        }
        if (i10 == themeActivity.f0 || i10 == themeActivity.Z || i10 == themeActivity.v0 || i10 == themeActivity.A0 || i10 == themeActivity.G0) {
            return 2;
        }
        if (i10 == themeActivity.r0 || i10 == themeActivity.V || i10 == themeActivity.c0 || i10 == themeActivity.O || i10 == themeActivity.h0 || i10 == themeActivity.n0 || i10 == themeActivity.k0 || i10 == themeActivity.J || i10 == themeActivity.I0 || i10 == themeActivity.z0 || i10 == themeActivity.B0 || i10 == themeActivity.C0 || i10 == themeActivity.D0) {
            return 3;
        }
        if (i10 == themeActivity.R || i10 == themeActivity.S || i10 == themeActivity.T || i10 == themeActivity.U) {
            return 4;
        }
        if (i10 == themeActivity.W || i10 == themeActivity.d0 || i10 == themeActivity.g0 || i10 == themeActivity.x || i10 == themeActivity.i0 || i10 == themeActivity.w || i10 == themeActivity.l0 || i10 == themeActivity.j0 || i10 == themeActivity.t0 || i10 == themeActivity.w0 || i10 == themeActivity.H0 || i10 == themeActivity.E0 || i10 == themeActivity.F0) {
            return 5;
        }
        if (i10 == themeActivity.e0) {
            return 6;
        }
        if (i10 == themeActivity.X || i10 == themeActivity.G || i10 == themeActivity.E) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.y || i10 == themeActivity.s0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.F) {
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
        if (i10 == themeActivity.m0) {
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
        if (i10 == themeActivity.o0) {
            return 11;
        }
        if (i10 == themeActivity.q0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.y0) {
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
        if (i10 == themeActivity.u0) {
            return 15;
        }
        if (i10 == themeActivity.x0) {
            return 16;
        }
        if (i10 == themeActivity.p0) {
            return 17;
        }
        if (i10 == themeActivity.H || i10 == themeActivity.I) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
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
        int i23 = c1Var.f;
        View view = c1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.h6.o == 0 || org.telegram.ui.ActionBar.h6.J == null) {
                    eaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    eaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.h6.z0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.a0) {
                int i24 = org.telegram.ui.ActionBar.h6.r;
                int i25 = i24 / 60;
                eaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.b0) {
                int i26 = org.telegram.ui.ActionBar.h6.s;
                int i27 = i26 / 60;
                eaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.Y) {
                eaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.w, false, false);
                return;
            }
            if (i10 == themeActivity.Q) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                eaVar.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.P) {
                eaVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.K) {
                int i29 = SharedConfig.distanceSystemType;
                eaVar.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.O0, themeActivity.D0 >= 0);
                themeActivity.O0 = false;
                return;
            } else if (i10 == themeActivity.L) {
                eaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.n1.a().a, themeActivity.P0, false);
                return;
            } else {
                if (i10 == themeActivity.M) {
                    eaVar.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.N0, false);
                    themeActivity.N0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setFixedSize(0);
            if (i10 == themeActivity.f0) {
                e9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.h6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.Z) {
                e9Var.setText(ThemeActivity.y0());
                return;
            }
            if (i10 == themeActivity.v0) {
                e9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                e9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            if (i10 == themeActivity.R) {
                jaVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.h6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.S) {
                jaVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.h6.o == 1, true);
                return;
            } else if (i10 == themeActivity.T) {
                jaVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.h6.o == 2, themeActivity.U != -1);
                return;
            } else {
                if (i10 == themeActivity.U) {
                    jaVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.h6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == themeActivity.W) {
                m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.d0) {
                m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.g0) {
                m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.i0) {
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
            if (i10 == themeActivity.l0) {
                m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.j0) {
                m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.t0) {
                m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.w0) {
                m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.H0) {
                m4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.F0) {
                m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.E0) {
                    m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.h6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == themeActivity.X) {
                w8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.h6.p, true);
                return;
            }
            if (i10 == themeActivity.N) {
                w8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.G) {
                w8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.E) {
                w8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                w8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.F) {
                w8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                w8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                w8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                w8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                w8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.s0) {
                    w8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                r8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                r8Var.m(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.y0) {
                r8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i32, i32);
                r8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                r8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i33, i33);
                r8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                r8Var.e(org.telegram.ui.ActionBar.h6.J5, org.telegram.ui.ActionBar.h6.G6);
                r8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                r8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                r8Var.v = 60;
                r8Var.s = 64;
                r8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                r8Var.e(org.telegram.ui.ActionBar.h6.J5, org.telegram.ui.ActionBar.h6.G6);
                r8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                r8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                r8Var.s = 64;
                r8Var.v = 60;
                r8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((bv) view).b();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
            if (i10 == themeActivity.H) {
                j6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                j6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((yo0) view).set(themeActivity.getUserConfig().getCurrentUser());
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
                    boolean z10 = org.telegram.ui.ActionBar.h6.o != 0;
                    String z02 = z10 ? org.telegram.ui.ActionBar.h6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z10) {
                        int i34 = org.telegram.ui.ActionBar.h6.o;
                        z02 = a4.a.D(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
                    }
                    j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.x1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) view;
                ac1 ac1Var = (ac1) wl0Var.getAdapter();
                ac1Var.l();
                int indexOf = ac1Var.e.indexOf(ac1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = ac1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((s4.c0) wl0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.ja] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.ub1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.yo0] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? jaVar;
        View j5Var;
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                j5Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                jaVar = new org.telegram.ui.Cells.ja(context);
                jaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                jaVar.a = textView;
                org.telegram.messenger.ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z10 = LocaleController.isRTL;
                jaVar.addView(textView, w7.y5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                jaVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                jaVar.addView(imageView, w7.y5.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = jaVar;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new tb1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                j5Var = new zb1(themeActivity, context);
                break;
            case 9:
                jaVar = new ub1(context);
                jaVar.b = new org.telegram.ui.Cells.y0[2];
                jaVar.setOrientation(0);
                jaVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) jaVar.b;
                    if (i14 >= y0VarArr.length) {
                        j5Var = jaVar;
                        break;
                    } else {
                        boolean z11 = i14 == 1;
                        org.telegram.ui.Cells.y0 y0Var = new org.telegram.ui.Cells.y0(context);
                        y0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        y0Var.d = textPaint;
                        y0Var.setWillNotDraw(false);
                        y0Var.b = z11;
                        y0Var.setContentDescription(LocaleController.getString(z11 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(y0Var, context);
                        y0Var.a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        y0Var.addView(x0Var, w7.y5.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        x0Var.a((z11 && SharedConfig.useThreeLinesLayout) || !(z11 || SharedConfig.useThreeLinesLayout), false);
                        y0VarArr[i14] = y0Var;
                        jaVar.addView(((org.telegram.ui.Cells.y0[]) jaVar.b)[i14], w7.y5.m(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) jaVar.b)[i14].setOnClickListener(new ai.j3(3, jaVar, z11));
                        i14++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                vb1 vb1Var = new vb1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = vb1Var;
                vb1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                wb1 wb1Var = new wb1(context, 0, d6Var);
                wb1Var.setFocusable(false);
                wb1Var.setItemAnimator(null);
                wb1Var.setLayoutAnimation(null);
                wb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                wb1Var.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.j1(0);
                wb1Var.setLayoutManager(c0Var);
                ac1 ac1Var = new ac1(themeActivity, context);
                wb1Var.setAdapter(ac1Var);
                wb1Var.setOnItemClickListener(new rb1(this, ac1Var, wb1Var, 0));
                wb1Var.setOnItemLongClickListener(new ds0(14, this, ac1Var));
                wb1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(62.0f)));
                j5Var = wb1Var;
                break;
            case 13:
                j5Var = new ob1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.m2) themeActivity).currentAccount;
                org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(context);
                Paint paint = new Paint(1);
                dz0Var.a = paint;
                dz0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                dz0Var.c = paint2;
                Paint paint3 = new Paint(1);
                dz0Var.d = paint3;
                dz0Var.e = new RectF();
                dz0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                dz0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.h6.Y5, org.telegram.ui.ActionBar.h6.d9};
                dz0Var.r = new org.telegram.ui.Components.ij0[6];
                dz0Var.v = new org.telegram.ui.Components.lj0[2];
                dz0Var.x = 1.0f;
                int i15 = org.telegram.ui.ActionBar.h6.c9;
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
                org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(dz0Var, context);
                dz0Var.f = cz0Var;
                cz0Var.setMinValue(0);
                cz0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i11).dialogFilters.isEmpty();
                cz0Var.setMaxValue(isEmpty ? 4 : 5);
                cz0Var.setAllItemsCount(isEmpty ? 5 : 6);
                cz0Var.setWrapSelectorWheel(true);
                cz0Var.setFormatter(new org.telegram.ui.Components.bz0(dz0Var));
                cz0Var.setOnValueChangedListener(new org.telegram.ui.Components.bz0(dz0Var));
                cz0Var.setImportantForAccessibility(2);
                cz0Var.setValue(SharedConfig.getChatSwipeAction(i11));
                dz0Var.addView(cz0Var, w7.y5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                dz0Var.setWillNotDraw(false);
                dz0Var.s = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    dz0Var.v[i16] = new org.telegram.ui.Components.lj0(context);
                    dz0Var.addView(dz0Var.v[i16], w7.y5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.ij0 a2 = dz0Var.a(dz0Var.f.getValue());
                if (a2 != null) {
                    dz0Var.v[0].setImageDrawable(a2);
                    a2.M(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(dz0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(dz0Var.v[1], false, 0.5f, false);
                dz0Var.w = dz0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                dz0Var.F = dz0Var.f.getValue();
                j5Var = dz0Var;
                break;
            case 16:
                b5Var = ((org.telegram.ui.ActionBar.m2) themeActivity).parentLayout;
                View xb1Var = new xb1(context, b5Var, 0);
                xb1Var.setImportantForAccessibility(4);
                j5Var = xb1Var;
                break;
            case 17:
                View bvVar = new bv(themeActivity.f, context, themeActivity);
                bvVar.setFocusable(false);
                bvVar.setLayoutParams(new s4.p0(-1, -2));
                j5Var = bvVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.j6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.m2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.X2 = new ArrayList();
                tVar.Z2 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                tVar.Y2 = c0Var2;
                tVar.setLayoutManager(c0Var2);
                int i17 = 1;
                tVar.setAdapter(new w7(tVar, i17));
                tVar.i(new ci.r1(tVar, i17));
                tVar.setOnItemClickListener(new ai.u0(tVar, themeActivity, context, 3));
                tVar.w1();
                j5Var = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.m2) themeActivity).currentAccount;
                jaVar = new yo0(i13, 0L, this.c, themeActivity.getResourceProvider());
                j5Var = jaVar;
                break;
        }
        return new org.telegram.ui.Components.gl0(j5Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 4) {
            ((org.telegram.ui.Cells.ja) c1Var.a).setTypeChecked(c1Var.b() == org.telegram.ui.ActionBar.h6.o);
        }
    }
}

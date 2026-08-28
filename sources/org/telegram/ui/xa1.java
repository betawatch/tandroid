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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xa1 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public xa1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 1 || i9 == 4 || i9 == 7 || i9 == 10 || i9 == 11 || i9 == 12 || i9 == 14 || i9 == 18 || i9 == 20 || i9 == 21;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.F0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
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
        ThemeActivity themeActivity = this.e;
        if (i9 == themeActivity.W || i9 == themeActivity.G || i9 == themeActivity.X || i9 == themeActivity.U || i9 == themeActivity.L || i9 == themeActivity.M || i9 == themeActivity.I || i9 == themeActivity.H) {
            return 1;
        }
        if (i9 == themeActivity.b0 || i9 == themeActivity.V || i9 == themeActivity.r0 || i9 == themeActivity.w0 || i9 == themeActivity.C0) {
            return 2;
        }
        if (i9 == themeActivity.n0 || i9 == themeActivity.R || i9 == themeActivity.Y || i9 == themeActivity.K || i9 == themeActivity.d0 || i9 == themeActivity.j0 || i9 == themeActivity.g0 || i9 == themeActivity.F || i9 == themeActivity.E0 || i9 == themeActivity.v0 || i9 == themeActivity.x0 || i9 == themeActivity.y0 || i9 == themeActivity.z0) {
            return 3;
        }
        if (i9 == themeActivity.N || i9 == themeActivity.O || i9 == themeActivity.P || i9 == themeActivity.Q) {
            return 4;
        }
        if (i9 == themeActivity.S || i9 == themeActivity.Z || i9 == themeActivity.c0 || i9 == themeActivity.x || i9 == themeActivity.e0 || i9 == themeActivity.w || i9 == themeActivity.h0 || i9 == themeActivity.f0 || i9 == themeActivity.p0 || i9 == themeActivity.s0 || i9 == themeActivity.D0 || i9 == themeActivity.A0 || i9 == themeActivity.B0) {
            return 5;
        }
        if (i9 == themeActivity.a0) {
            return 6;
        }
        if (i9 == themeActivity.T || i9 == themeActivity.C || i9 == themeActivity.A) {
            return 7;
        }
        i10 = themeActivity.raiseToListenRow;
        if (i9 == i10) {
            return 7;
        }
        i11 = themeActivity.pauseOnRecordRow;
        if (i9 == i11 || i9 == themeActivity.y || i9 == themeActivity.o0) {
            return 7;
        }
        i12 = themeActivity.pauseOnMediaRow;
        if (i9 == i12 || i9 == themeActivity.B) {
            return 7;
        }
        i13 = themeActivity.sensitiveContentRow;
        if (i9 == i13) {
            return 7;
        }
        i14 = themeActivity.textSizeRow;
        if (i9 == i14) {
            return 8;
        }
        if (i9 == themeActivity.i0) {
            return 9;
        }
        i15 = themeActivity.nightThemeRow;
        if (i9 == i15) {
            return 10;
        }
        i16 = themeActivity.browserRow;
        if (i9 == i16) {
            return 10;
        }
        if (i9 == themeActivity.k0) {
            return 11;
        }
        if (i9 == themeActivity.m0) {
            return 12;
        }
        i17 = themeActivity.bubbleRadiusRow;
        if (i9 == i17) {
            return 13;
        }
        i18 = themeActivity.backgroundRow;
        if (i9 == i18 || i9 == themeActivity.u0) {
            return 14;
        }
        i19 = themeActivity.createNewThemeRow;
        if (i9 == i19) {
            return 14;
        }
        i20 = themeActivity.liteModeRow;
        if (i9 == i20) {
            return 14;
        }
        i21 = themeActivity.stickersRow;
        if (i9 == i21) {
            return 14;
        }
        if (i9 == themeActivity.q0) {
            return 15;
        }
        if (i9 == themeActivity.t0) {
            return 16;
        }
        if (i9 == themeActivity.l0) {
            return 17;
        }
        if (i9 == themeActivity.D || i9 == themeActivity.E) {
            return 19;
        }
        i22 = themeActivity.appIconSelectorRow;
        if (i9 == i22) {
            return 20;
        }
        i23 = themeActivity.changeUserColor;
        return i9 == i23 ? 21 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
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
        int i22 = q1Var.f;
        View view = q1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i22 == 1) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            i10 = themeActivity.nightThemeRow;
            if (i9 == i10) {
                if (org.telegram.ui.ActionBar.f6.o == 0 || org.telegram.ui.ActionBar.f6.J == null) {
                    baVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    baVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.f6.z0(), false, false);
                    return;
                }
            }
            if (i9 == themeActivity.W) {
                int i23 = org.telegram.ui.ActionBar.f6.r;
                int i24 = i23 / 60;
                baVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i23 - (i24 * 60))), false, true);
                return;
            }
            if (i9 == themeActivity.X) {
                int i25 = org.telegram.ui.ActionBar.f6.s;
                int i26 = i25 / 60;
                baVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i25 - (i26 * 60))), false, false);
                return;
            }
            if (i9 == themeActivity.U) {
                baVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.f6.w, false, false);
                return;
            }
            if (i9 == themeActivity.M) {
                int i27 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                baVar.c(LocaleController.getString("SortBy", R.string.SortBy), i27 == 0 ? LocaleController.getString("Default", R.string.Default) : i27 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i9 == themeActivity.L) {
                baVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i9 == themeActivity.G) {
                int i28 = SharedConfig.distanceSystemType;
                baVar.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i28 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i28 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.K0, themeActivity.z0 >= 0);
                themeActivity.K0 = false;
                return;
            } else if (i9 == themeActivity.H) {
                baVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.j1.a().a, themeActivity.L0, false);
                return;
            } else {
                if (i9 == themeActivity.I) {
                    baVar.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.J0, false);
                    themeActivity.J0 = false;
                    return;
                }
                return;
            }
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            if (i9 == themeActivity.b0) {
                b9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.f6.q * 100.0f))));
                return;
            }
            if (i9 == themeActivity.V) {
                b9Var.setText(ThemeActivity.x0());
                return;
            }
            if (i9 == themeActivity.r0) {
                b9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i9 == themeActivity.C0) {
                b9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        if (i22 == 4) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (i9 == themeActivity.N) {
                gaVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.f6.o == 0, true);
                return;
            }
            if (i9 == themeActivity.O) {
                gaVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.f6.o == 1, true);
                return;
            } else if (i9 == themeActivity.P) {
                gaVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.f6.o == 2, themeActivity.Q != -1);
                return;
            } else {
                if (i9 == themeActivity.Q) {
                    gaVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.f6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i22 == 5) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == themeActivity.S) {
                m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i9 == themeActivity.Z) {
                m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i9 == themeActivity.c0) {
                m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i9 == themeActivity.x) {
                m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i9 == themeActivity.e0) {
                if (themeActivity.f == 3) {
                    m4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i9 == themeActivity.w) {
                m4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i9 == themeActivity.h0) {
                m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i9 == themeActivity.f0) {
                m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i9 == themeActivity.p0) {
                m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i9 == themeActivity.s0) {
                m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i9 == themeActivity.D0) {
                m4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i9 == themeActivity.B0) {
                m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i9 == themeActivity.A0) {
                    m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i22 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.f6.q);
            return;
        }
        if (i22 == 7) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            if (i9 == themeActivity.T) {
                t8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.f6.p, true);
                return;
            }
            if (i9 == themeActivity.J) {
                t8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i9 == themeActivity.C) {
                t8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i9 == themeActivity.A) {
                t8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i11 = themeActivity.raiseToListenRow;
            if (i9 == i11) {
                t8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i9 == themeActivity.B) {
                t8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i12 = themeActivity.pauseOnRecordRow;
            if (i9 == i12) {
                t8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i13 = themeActivity.pauseOnMediaRow;
            if (i9 == i13) {
                t8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i9 == themeActivity.y) {
                t8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i14 = themeActivity.sensitiveContentRow;
            if (i9 == i14) {
                t8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i9 == themeActivity.o0) {
                    t8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i22 == 14) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.v = 48;
            i15 = themeActivity.backgroundRow;
            if (i9 == i15) {
                p8Var.setSubtitle(null);
                int i29 = org.telegram.ui.ActionBar.f6.q6;
                p8Var.e(i29, i29);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i30 = R.drawable.msg_background;
                i19 = themeActivity.changeUserColor;
                p8Var.m(i30, string, i19 >= 0);
                return;
            }
            if (i9 == themeActivity.u0) {
                p8Var.setSubtitle(null);
                int i31 = org.telegram.ui.ActionBar.f6.q6;
                p8Var.e(i31, i31);
                p8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i16 = themeActivity.createNewThemeRow;
            if (i9 == i16) {
                p8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.f6.q6;
                p8Var.e(i32, i32);
                p8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i17 = themeActivity.liteModeRow;
            if (i9 == i17) {
                p8Var.e(org.telegram.ui.ActionBar.f6.J5, org.telegram.ui.ActionBar.f6.G6);
                p8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                p8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                p8Var.v = 60;
                p8Var.s = 64;
                p8Var.w = 20;
                return;
            }
            i18 = themeActivity.stickersRow;
            if (i9 == i18) {
                p8Var.e(org.telegram.ui.ActionBar.f6.J5, org.telegram.ui.ActionBar.f6.G6);
                p8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                p8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                p8Var.s = 64;
                p8Var.v = 60;
                p8Var.w = 20;
                return;
            }
            return;
        }
        if (i22 == 17) {
            ((tu) view).b();
            return;
        }
        if (i22 == 19) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i9 == themeActivity.D) {
                i6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                i6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i22 == 21) {
            ((ho0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i22) {
            case 10:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i20 = themeActivity.nightThemeRow;
                if (i9 != i20) {
                    i21 = themeActivity.browserRow;
                    if (i9 == i21) {
                        j5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.f6.o != 0;
                    String z02 = z10 ? org.telegram.ui.ActionBar.f6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z10) {
                        int i33 = org.telegram.ui.ActionBar.f6.o;
                        z02 = aa.d.z(i33 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i33 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
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
                org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) view;
                za1 za1Var = (za1) wk0Var.getAdapter();
                za1Var.l();
                int indexOf = za1Var.e.indexOf(za1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = za1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((f2.m0) wk0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.ga] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.ta1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.ho0] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ?? gaVar;
        View j5Var;
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.b6 b6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i9) {
            case 1:
                j5Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                gaVar.a = textView;
                org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z10 = LocaleController.isRTL;
                gaVar.addView(textView, g7.e6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                gaVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                gaVar.addView(imageView, g7.e6.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = gaVar;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new sa1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 8:
                j5Var = new ya1(themeActivity, context);
                break;
            case 9:
                gaVar = new ta1(context);
                gaVar.b = new org.telegram.ui.Cells.y0[2];
                gaVar.setOrientation(0);
                gaVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) gaVar.b;
                    if (i13 >= y0VarArr.length) {
                        j5Var = gaVar;
                        break;
                    } else {
                        boolean z11 = i13 == 1;
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
                        y0Var.addView(x0Var, g7.e6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        x0Var.a((z11 && SharedConfig.useThreeLinesLayout) || !(z11 || SharedConfig.useThreeLinesLayout), false);
                        y0VarArr[i13] = y0Var;
                        gaVar.addView(((org.telegram.ui.Cells.y0[]) gaVar.b)[i13], g7.e6.m(0.5f, -1, -1, i13 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) gaVar.b)[i13].setOnClickListener(new ih.b2(3, gaVar, z11));
                        i13++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                ua1 ua1Var = new ua1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = ua1Var;
                ua1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                va1 va1Var = new va1(context, 0, b6Var);
                va1Var.setFocusable(false);
                va1Var.setItemAnimator(null);
                va1Var.setLayoutAnimation(null);
                va1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                va1Var.setClipToPadding(false);
                f2.m0 m0Var = new f2.m0();
                m0Var.j1(0);
                va1Var.setLayoutManager(m0Var);
                za1 za1Var = new za1(themeActivity, context);
                va1Var.setAdapter(za1Var);
                va1Var.setOnItemClickListener(new qa1(this, za1Var, va1Var, 0));
                va1Var.setOnItemLongClickListener(new nl0(22, this, za1Var));
                va1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(62.0f)));
                j5Var = va1Var;
                break;
            case 13:
                j5Var = new na1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 15:
                i10 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                org.telegram.ui.Components.ay0 ay0Var = new org.telegram.ui.Components.ay0(context);
                Paint paint = new Paint(1);
                ay0Var.a = paint;
                ay0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                ay0Var.c = paint2;
                Paint paint3 = new Paint(1);
                ay0Var.d = paint3;
                ay0Var.e = new RectF();
                ay0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                ay0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.f6.Y5, org.telegram.ui.ActionBar.f6.d9};
                ay0Var.r = new org.telegram.ui.Components.mi0[6];
                ay0Var.v = new org.telegram.ui.Components.pi0[2];
                ay0Var.x = 1.0f;
                int i14 = org.telegram.ui.ActionBar.f6.c9;
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
                org.telegram.ui.Components.zx0 zx0Var = new org.telegram.ui.Components.zx0(ay0Var, context);
                ay0Var.f = zx0Var;
                zx0Var.setMinValue(0);
                zx0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
                zx0Var.setMaxValue(isEmpty ? 4 : 5);
                zx0Var.setAllItemsCount(isEmpty ? 5 : 6);
                zx0Var.setWrapSelectorWheel(true);
                zx0Var.setFormatter(new org.telegram.ui.Components.yx0(ay0Var));
                zx0Var.setOnValueChangedListener(new org.telegram.ui.Components.yx0(ay0Var));
                zx0Var.setImportantForAccessibility(2);
                zx0Var.setValue(SharedConfig.getChatSwipeAction(i10));
                ay0Var.addView(zx0Var, g7.e6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                ay0Var.setWillNotDraw(false);
                ay0Var.s = 0;
                for (int i15 = 0; i15 < 2; i15++) {
                    ay0Var.v[i15] = new org.telegram.ui.Components.pi0(context);
                    ay0Var.addView(ay0Var.v[i15], g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.mi0 a2 = ay0Var.a(ay0Var.f.getValue());
                if (a2 != null) {
                    ay0Var.v[0].setImageDrawable(a2);
                    a2.K(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(ay0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(ay0Var.v[1], false, 0.5f, false);
                ay0Var.w = ay0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                ay0Var.B = ay0Var.f.getValue();
                j5Var = ay0Var;
                break;
            case 16:
                b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                View wa1Var = new wa1(context, b5Var, 0);
                wa1Var.setImportantForAccessibility(4);
                j5Var = wa1Var;
                break;
            case 17:
                View tuVar = new tu(themeActivity.f, context, themeActivity);
                tuVar.setFocusable(false);
                tuVar.setLayoutParams(new f2.a1(-1, -2));
                j5Var = tuVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.T2 = new ArrayList();
                tVar.V2 = i11;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                f2.m0 m0Var2 = new f2.m0(0, false);
                tVar.U2 = m0Var2;
                tVar.setLayoutManager(m0Var2);
                tVar.setAdapter(new v7(tVar, 1));
                tVar.i(new bg.p2(tVar, 2));
                tVar.setOnItemClickListener(new ih.f0(tVar, themeActivity, context, 3));
                tVar.w1();
                j5Var = tVar;
                break;
            case 21:
                i12 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                gaVar = new ho0(i12, 0L, this.c, themeActivity.getResourceProvider());
                j5Var = gaVar;
                break;
        }
        return new org.telegram.ui.Components.ik0(j5Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        if (q1Var.f == 4) {
            ((org.telegram.ui.Cells.ga) q1Var.a).setTypeChecked(q1Var.b() == org.telegram.ui.ActionBar.f6.o);
        }
    }
}

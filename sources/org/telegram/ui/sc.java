package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sc extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ gd c;

    public sc(gd gdVar) {
        this.c = gdVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.R;
    }

    @Override // s4.g0
    public final int j(int i10) {
        gd gdVar = this.c;
        if (i10 == gdVar.S) {
            return 0;
        }
        if (i10 == gdVar.W) {
            return 2;
        }
        if (i10 == gdVar.Z) {
            return 1;
        }
        if (i10 == gdVar.T) {
            return 3;
        }
        if (i10 == gdVar.b0) {
            return 4;
        }
        if (i10 == gdVar.U || i10 == gdVar.c0 || i10 == gdVar.f0 || i10 == gdVar.h0 || i10 == gdVar.j0) {
            return 6;
        }
        return (i10 == gdVar.X || i10 == gdVar.e0) ? 5 : 7;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        gd gdVar = this.c;
        long j10 = gdVar.a;
        int i16 = b1Var.f;
        View view = b1Var.a;
        if (i16 == 1) {
            zc zcVar = (zc) view;
            kp0 kp0Var = zcVar.a;
            yc ycVar = zcVar.b;
            i11 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            kp0Var.b(i11, gdVar.s, false);
            ycVar.b(gdVar.s, false);
            ycVar.d(gdVar.w, false, false);
            ycVar.setForum(gdVar.R0());
            ycVar.e(DialogObject.getEmojiStatusDocumentId(gdVar.y), false, false);
            ycVar.a(gdVar.f);
            return;
        }
        if (i16 == 3) {
            ((xc) view).a(gdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((bq0) view).a(gdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == gdVar.e0) {
                r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            r8Var.i(LocaleController.getString(gdVar.P0()), false);
            if (gdVar.b < gdVar.z0()) {
                r8Var.h(gdVar.z0());
                return;
            } else {
                r8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setFixedSize(0);
            if (i10 == gdVar.a0) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            if (i10 == gdVar.V) {
                e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == gdVar.Y) {
                e9Var.setText(LocaleController.getString(gdVar.N0()));
                return;
            }
            if (i10 == gdVar.d0) {
                e9Var.setText(LocaleController.getString(gdVar.K0()));
                return;
            }
            if (i10 == gdVar.g0) {
                e9Var.setText(LocaleController.getString(gdVar.E0()));
                return;
            }
            if (i10 == gdVar.i0) {
                e9Var.setText(LocaleController.getString(gdVar.A0()));
                return;
            }
            if (i10 == gdVar.k0) {
                e9Var.setText(LocaleController.getString(gdVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        tc tcVar = (tc) view;
        tcVar.e = false;
        org.telegram.ui.ActionBar.h5 h5Var = tcVar.a;
        tcVar.setWillNotDraw(true);
        if (i10 == gdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            tcVar.a(i15, gdVar.f, true);
            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (gdVar.b < gdVar.getMessagesController().channelBgIconLevelMin) {
                tcVar.e(gdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                tcVar.e(0);
            }
            tcVar.c(gdVar.n, false, false);
            return;
        }
        if (i10 == gdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            tcVar.a(i14, gdVar.s, false);
            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = gdVar.e0 >= 0;
            tcVar.e = z10;
            tcVar.setWillNotDraw(!z10);
            if (gdVar.b < gdVar.J0()) {
                tcVar.e(gdVar.J0());
            } else {
                tcVar.e(0);
            }
            tcVar.c(gdVar.w, false, false);
            return;
        }
        if (i10 == gdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            tcVar.a(i13, gdVar.s, false);
            h5Var.l(LocaleController.getString(gdVar.G0()), false);
            if (gdVar.b < gdVar.F0()) {
                tcVar.e(gdVar.F0());
            } else {
                tcVar.e(0);
            }
            tcVar.c(DialogObject.getEmojiStatusDocumentId(gdVar.y), DialogObject.isEmojiStatusCollectible(gdVar.y), false);
            return;
        }
        if (i10 != gdVar.h0) {
            if (i10 == gdVar.j0) {
                h5Var.l(LocaleController.getString(gdVar.M0()), false);
                tcVar.e(0);
                TLRPC.ChatFull chatFull = gdVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    tcVar.c(0L, false, false);
                    return;
                } else {
                    tcVar.d(gdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
        tcVar.a(i12, gdVar.s, false);
        h5Var.l(LocaleController.getString(gdVar.B0()), false);
        if (gdVar.b < gdVar.H0()) {
            tcVar.e(gdVar.H0());
        } else {
            tcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = gdVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            tcVar.c(0L, false, false);
        } else {
            tcVar.c(gdVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        gd gdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = gdVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) gdVar).parentLayout;
            int I0 = gdVar.I0();
            long j10 = gdVar.a;
            c6Var8 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, b5Var, I0, j10, c6Var8);
            gaVar.x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.r = gdVar;
            Drawable drawable = gdVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            Drawable f7 = di.a7.f(drawable, i14, gdVar.F, gdVar.J);
            gdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            frameLayout = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = gdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            ed edVar = new ed(i13, parentActivity2, c6Var7);
            edVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(gdVar.F);
            if (wallpaperEmoticon == null && gdVar.F == null && gdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            edVar.a(wallpaperEmoticon, false);
            edVar.setGalleryWallpaper(gdVar.G);
            final int i15 = 0;
            edVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.rc
                public final /* synthetic */ sc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            gd gdVar2 = this.b.c;
                            if (str == null) {
                                gdVar2.F = gdVar2.G;
                            } else if (str.equals("❌")) {
                                gdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                gdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                gdVar2.F.settings.emoticon = str;
                            }
                            gdVar2.X0(true);
                            gdVar2.a1(true);
                            break;
                        default:
                            gd gdVar3 = this.b.c;
                            gdVar3.s = ((Integer) obj).intValue();
                            if (gdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                gdVar3.y = null;
                            }
                            gdVar3.X0(true);
                            gdVar3.b1();
                            gdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = edVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.r8(gdVar.getParentActivity(), gdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = gdVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            tc tcVar = new tc(parentActivity3);
            tcVar.e = false;
            tcVar.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            tcVar.a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            tcVar.addView(h5Var, w7.z5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            tcVar.c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, tcVar, false);
            frameLayout = tcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = gdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            xc xcVar = new xc(i12, parentActivity4, c6Var5);
            xcVar.b.setOnItemClickListener(new bi.z5(5, this, xcVar));
            frameLayout = xcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = gdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            bq0 bq0Var = new bq0(0, i11, parentActivity5, c6Var4);
            bq0Var.setDivider(false);
            final int i16 = 1;
            bq0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.rc
                public final /* synthetic */ sc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            gd gdVar2 = this.b.c;
                            if (str == null) {
                                gdVar2.F = gdVar2.G;
                            } else if (str.equals("❌")) {
                                gdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                gdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                gdVar2.F.settings.emoticon = str;
                            }
                            gdVar2.X0(true);
                            gdVar2.a1(true);
                            break;
                        default:
                            gd gdVar3 = this.b.c;
                            gdVar3.s = ((Integer) obj).intValue();
                            if (gdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                gdVar3.y = null;
                            }
                            gdVar3.X0(true);
                            gdVar3.b1();
                            gdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = bq0Var;
        } else if (i10 == 1) {
            FrameLayout zcVar = new zc(gdVar, gdVar.getParentActivity());
            frameLayout = zcVar;
            if (gdVar.d) {
                zcVar.setTag(-33024);
                frameLayout = zcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = gdVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = gdVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            frameLayout = new mp0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = gdVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(parentActivity8, c6Var);
            f10Var.setIsSingleCell(true);
            f10Var.setViewType(35);
            frameLayout = f10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(gdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        boolean z10 = view instanceof zc;
        gd gdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ga) {
                ((org.telegram.ui.Cells.ga) view).setOverrideBackground(gdVar.H);
                return;
            } else {
                gd.Y0(view);
                return;
            }
        }
        yc ycVar = ((zc) view).b;
        TLRPC.EmojiStatus emojiStatus = gdVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            ycVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            ycVar.d(((TLRPC.TL_emojiStatusCollectible) gdVar.y).pattern_document_id, true, false);
        } else {
            ycVar.b(gdVar.s, false);
            ycVar.d(gdVar.w, false, false);
        }
        ycVar.e(DialogObject.getEmojiStatusDocumentId(gdVar.y), DialogObject.isEmojiStatusCollectible(gdVar.y), false);
        ycVar.setForum(gdVar.R0());
        ycVar.a(gdVar.f);
    }
}

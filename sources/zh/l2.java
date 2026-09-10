package zh;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l2 extends p6 {
    public final /* synthetic */ u7 x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 y0;
    public final /* synthetic */ a3 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(a3 a3Var, Context context, b bVar, u7 u7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.z0 = a3Var;
        this.x0 = u7Var;
        this.y0 = f6Var;
    }

    @Override // zh.p6
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            a3 a3Var = this.z0;
            if (a3Var.Q1 == null) {
                return;
            }
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.p5.f(a3Var.C2, y5Var.documentId);
            }
            if (document == null) {
                return;
            }
            h2 h2Var = a3Var.c1;
            org.telegram.ui.ActionBar.f6 f6Var = this.y0;
            pc h = new wc(h2Var, f6Var).h(document, 2, new org.telegram.ui.Components.h7(this, this.x0, f6Var, 9));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // zh.p6
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof c61;
        u7 u7Var = this.x0;
        a3 a3Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Utilities.parseLong(((c61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(a3Var.C2).openChatOrProfileWith(user, null, u7Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof z51)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof b61);
                return;
            }
            if (!(characterStyle instanceof y51)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                y51 y51Var = (y51) characterStyle;
                AndroidUtilities.addToClipboard(y51Var.a.subSequence(y51Var.b, y51Var.c).toString());
                em.o(R.string.TextCopied, new wc(a3Var.c1, this.y0));
                return;
            }
        }
        String url = ((z51) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                u7Var.H(new l40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            u7Var.H(new la0(bundle, null));
            return;
        }
        String b10 = nf.f.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(a3Var.C2).openByUserName(lowerCase, u7Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // zh.p6
    public final void H(final URLSpan uRLSpan, final View view, k5 k5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, f6Var, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        h3Var.multipleLinesTitle = true;
        a3 a3Var = this.z0;
        z2 z2Var = a3Var.O1;
        CharSequence[] charSequenceArr = (z2Var == null || z2Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: zh.k2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                l2 l2Var = l2.this;
                if (i10 == 0) {
                    l2Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new wc(l2Var.z0.c1, f6Var2).k(false).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        h3Var.setOnHideListener(new gg.o(k5Var, 13));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        ((l7) a3Var.Q1).h(h3Var);
    }

    @Override // zh.p6
    public final void I(j6 j6Var) {
        if (j6Var == null) {
            return;
        }
        final TLRPC.Document document = j6Var.g;
        a3 a3Var = this.z0;
        u7 u7Var = this.x0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        if (document != null) {
            w70 F = w70.F(u7Var.v, f6Var, a3Var.K0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: zh.i2
                public final /* synthetic */ l2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            a3 a3Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(a3Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(a3Var2.C2).getClientUserId();
                            z2 z2Var = a3Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, z2Var != null ? z2Var.a : null, null, false));
                            new wc(a3Var2.c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new bi.f0(20))).k(true);
                            break;
                        default:
                            a3 a3Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(a3Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(a3Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new wc(a3Var3.c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: zh.i2
                public final /* synthetic */ l2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            a3 a3Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(a3Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(a3Var2.C2).getClientUserId();
                            z2 z2Var = a3Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, z2Var != null ? z2Var.a : null, null, false));
                            new wc(a3Var2.c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new bi.f0(20))).k(true);
                            break;
                        default:
                            a3 a3Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(a3Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(a3Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new wc(a3Var3.c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (j6Var.e && j6Var.b != null && j6Var.d != null) {
            Bundle bundle = new Bundle();
            if (j6Var.b.longValue() >= 0) {
                bundle.putLong("user_id", j6Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -j6Var.b.longValue());
            }
            bundle.putInt("message_id", j6Var.d.intValue());
            u7Var.H(new eo(bundle));
            return;
        }
        if (j6Var.b != null && j6Var.c != null) {
            MessagesController.getInstance(a3Var.C2).getStoriesController().d0(j6Var.b.longValue(), j6Var.c.intValue(), new sg.l0(this, j6Var, u7Var, f6Var, 1));
            return;
        }
        pc Q = new wc(a3Var.c1, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        b11 b11Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            u7 u7Var = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.d5.r0(u7Var.f, str, true, true, true, (!(characterStyle instanceof b61) || (b11Var = ((b61) characterStyle).a) == null || (b11Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.d5.r0(u7Var.f, str, true, true, false, false, null, null, this.y0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            nf.f.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            nf.f.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            nf.f.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}

package yg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import g7.z7;
import j3.r0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class i {
    public static int a(MessageObject messageObject) {
        if (messageObject.type != 17) {
            return 0;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i9 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return 0;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        int i10 = poll.closed ? 8 : 0;
        if (poll.subscribers_only) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId())));
            if (chat != null) {
                if (chat.left || chat.kicked) {
                    i10 |= 1;
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - chat.date < 86400) {
                    i10 |= 2;
                }
            }
        }
        ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i9).config.phoneCountryIso2.get())) {
                return i10 | 4;
            }
        }
        return i10;
    }

    public static SpannableStringBuilder b(MessageObject messageObject, int i9) {
        if (messageObject.type != 17) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i10 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return null;
        }
        if (!z7.a(i9, 4)) {
            if (z7.a(i9, 1)) {
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i10).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId()))))));
            }
            if (z7.a(i9, 2)) {
                return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
        ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            String str = arrayList2.get(i11);
            i11++;
            String str2 = str;
            String countryName = LocaleController.getCountryName(str2);
            if (!TextUtils.isEmpty(countryName)) {
                str2 = countryName;
            }
            arrayList.add(str2);
        }
        boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
        if (arrayList.size() == 1) {
            return AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOne : R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOne, arrayList.get(0)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append((String) arrayList.get(i12));
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther : R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther, stringBuffer, r0.j(1, arrayList)));
    }
}

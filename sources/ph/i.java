package ph;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import w7.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class i {
    public static int a(MessageObject messageObject) {
        if (messageObject.type != 17) {
            return 0;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i10 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return 0;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        int i11 = poll.closed ? 8 : 0;
        if (poll.subscribers_only) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId())));
            if (chat != null) {
                if (chat.left || chat.kicked) {
                    i11 |= 1;
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - chat.date < 86400) {
                    i11 |= 2;
                }
            }
        }
        ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i10).config.phoneCountryIso2.get())) {
                return i11 | 4;
            }
        }
        return i11;
    }

    public static SpannableStringBuilder b(MessageObject messageObject, int i10) {
        if (messageObject.type != 17) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i11 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return null;
        }
        if (!c0.a(i10, 4)) {
            if (c0.a(i10, 1)) {
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i11).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId()))))));
            }
            if (c0.a(i10, 2)) {
                return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
        ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            String str = arrayList2.get(i12);
            i12++;
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
        for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append((String) arrayList.get(i13));
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther : R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther, stringBuffer, hc.b.i(1, arrayList)));
    }
}

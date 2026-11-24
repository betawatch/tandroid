// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qdb implements Vector.TLDeserializer {
    public final /* synthetic */ byte a;

    public /* synthetic */ qdb(byte b) {
        this.a = b;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 0:
                return TLRPC.Theme.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TL_account.WebDomainException.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.ChatTheme.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.SecureValueError.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.TL_authorization.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_account.TL_businessChatLink.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TL_account.TL_connectedBot.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TL_account.RequirementToContact.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.PrivacyRule.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.TL_webAuthorization.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TL_aicompose.AiComposeTone.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.BotCommand.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_bots.botPreviewMedia.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TL_chatlists.TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TL_communities.CommunityPeerRequest.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TL_iv.PageBlock.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.InputPhoto.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TL_keyboard.PageButton.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TL_iv.PageListItem.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TL_iv.PageListOrderedItem.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TL_iv.pageRelatedArticle.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TL_iv.pageTableRow.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TL_iv.pageTableCell.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TL_keyboard.KeyboardInlineButton.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TL_stars.TL_StarGiftAuctionAcquiredGift.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_stars.TL_StarGiftActiveAuctionState.TLdeserialize(inputSerializedData, i, z);
        }
    }
}

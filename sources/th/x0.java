package th;

import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends TLRPC.TL_messageMediaStory {
    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.user_id = inputSerializedData.readInt64(z10);
        this.id = inputSerializedData.readInt32(z10);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        this.via_mention = inputSerializedData.readBool(z10);
        this.peer = vp.r1(d20.s0).y1(this.user_id);
    }

    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-946147811);
        outputSerializedData.writeInt64(this.user_id);
        outputSerializedData.writeInt32(this.id);
        this.storyItem.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.via_mention);
    }
}

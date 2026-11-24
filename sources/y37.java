// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y37 extends TLRPC.TL_messageMediaStory {
    @Override // org.telegram.tgnet.TLRPC.TL_messageMediaStory, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.user_id = inputSerializedData.readInt64(z);
        this.id = inputSerializedData.readInt32(z);
        this.storyItem = TL_stories.StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        this.via_mention = inputSerializedData.readBool(z);
        this.peer = oc7.r1(z8c.t0).x1(this.user_id);
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

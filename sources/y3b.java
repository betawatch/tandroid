// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class y3b extends TLObject {
    public final TL_stories.StoryItem a;
    public int b;

    public y3b(TL_stories.StoryItem storyItem) {
        this.b = 0;
        this.a = storyItem;
        boolean z = storyItem.translated;
        this.b = z ? 1 : 0;
        int i = (z ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
        this.b = i;
        int i2 = i + (storyItem.translatedText != null ? 4 : 0);
        this.b = i2;
        this.b = i2 + (storyItem.translatedLng != null ? 8 : 0);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        boolean z2 = (readInt32 & 1) != 0;
        TL_stories.StoryItem storyItem = this.a;
        storyItem.translated = z2;
        if ((readInt32 & 2) != 0) {
            storyItem.detectedLng = inputSerializedData.readString(z);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.b & 8) != 0) {
            storyItem.translatedLng = inputSerializedData.readString(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(1);
        outputSerializedData.writeInt32(this.b);
        int i = this.b & 2;
        TL_stories.StoryItem storyItem = this.a;
        if (i != 0) {
            outputSerializedData.writeString(storyItem.detectedLng);
        }
        if ((this.b & 4) != 0) {
            storyItem.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.b & 8) != 0) {
            outputSerializedData.writeString(storyItem.translatedLng);
        }
    }
}

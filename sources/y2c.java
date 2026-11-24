// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y2c extends TLObject {
    public TLRPC.TL_textWithEntities a;
    public ArrayList b = new ArrayList();
    public TLRPC.TL_textWithEntities c;

    public static y2c a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        y2c y2cVar = new y2c();
        y2cVar.a = poll.question;
        for (int i = 0; i < poll.answers.size(); i++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            y2cVar.b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            y2cVar.c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return y2cVar;
    }

    public static boolean b(k47 k47Var, y2c y2cVar) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia m1 = k47.m1(k47Var);
        if (!(m1 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1).poll) == null) {
            return true;
        }
        if ((poll.question != null) != (y2cVar.a != null)) {
            return false;
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        return (pollResults != null && pollResults.solution != null) == (y2cVar.c != null) && poll.answers.size() == y2cVar.b.size();
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        if ((readInt32 & 1) != 0) {
            this.a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((readInt32 & 2) != 0) {
            this.b = Vector.deserialize(inputSerializedData, new rjb((byte) 8), z);
        }
        if ((readInt32 & 4) != 0) {
            this.c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(613759672);
        int i = this.a != null ? 1 : 0;
        ArrayList arrayList = this.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i |= 2;
        }
        if (this.c != null) {
            i |= 4;
        }
        outputSerializedData.writeInt32(i);
        if ((i & 1) != 0) {
            this.a.serializeToStream(outputSerializedData);
        }
        if ((i & 2) != 0) {
            Vector.serialize(outputSerializedData, this.b);
        }
        if ((i & 4) != 0) {
            this.c.serializeToStream(outputSerializedData);
        }
    }
}

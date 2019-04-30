
```json
url:/block/getRecentBlocksById?blockchain_id=#{blockchain_id}
method：GET
successResponse：
{
   	"blockhash": "",
    "height": "",
	"time": "",
	"tx_size": ,
	"size_on_disk": "",
	"difficulty": ,
	"prev_blockhash": "",		
	"next_blockhash": "",
	"output_total": "",
	"transaction_fees": "",
	"merkle_root": "",
	"blockchain_id": ""
}
```

```json
url:/block/getRecentBlocksByNameType?name=#{name}&type=#{type}
method：GET
successResponse：
{
   	"height": "",
    "time": "",
	"tx_size": "",
	"sizeOnDisk": ""
}
```

```json
url:/block/getBlockDetailByHash?hash=#{hash}
method：GET
successResponse：
{
   	"height": "",
    "time": "",
	"tx_size": "",
	"sizeOnDisk": ""
}
```

```json
url:/block/getBlockDetailByHeight?height=#{height}
method：GET
successResponse：
{
   	"height": "",
    "time": "",
	"tx_size": "",
	"sizeOnDisk": ""
}
```

```json
url:/transaction/getRecentTransactionsById?txid=#{txid}
method：GET
successResponse：
{
   	"txid": "",
    "txhash": "",
	"time": "",
	"amount": ""
}
```

```json
url:/transaction/getRecentTransactionsByNameType?name=#{name}&type=#{type}
method：GET
successResponse：
{
   	"txid": "",
    "txhash": "",
	"time": "",
	"amount": ""
}
```

```json
url:/transaction/getTransactionInfoByTxid?txid=#{txid}
method：GET
successResponse：
{
   	"txid": "",
    "txhash": "",
	"size": "",
	"weight": "",
	"time": "",
	"totalInput": "",
	"totalOutput": "",
	"fees": "",
	"txDetails": [],
}
```

```json
url:/transaction/getTransactionInfoByTxhash?txhash=#{txid}
method：GET
successResponse：
{
   	"txid": "",
    "txhash": "",
	"size": "",
	"weight": "",
	"time": "",
	"totalInput": "",
	"totalOutput": "",
	"fees": "",
	"txDetails": [],
}	